package com.binance.client.impl;

import com.binance.client.SubscriptionOptions;
import com.binance.client.impl.WebSocketConnection.ConnectionState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class WebSocketWatchDog {

    private final CopyOnWriteArrayList<WebSocketConnection> TIME_HELPER = new CopyOnWriteArrayList<>();
    private final SubscriptionOptions options;
    private static final Logger log = LoggerFactory.getLogger(WebSocketConnection.class);

    WebSocketWatchDog(SubscriptionOptions subscriptionOptions) {
        this.options = Objects.requireNonNull(subscriptionOptions);
        //10秒钟检测一次
        long t = 30_000;
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);

        // Check the connection and reconnect if needed
        exec.scheduleAtFixedRate(() -> TIME_HELPER.forEach(connection -> {
            if (connection.getState() == ConnectionState.CONNECTED) {
                // Check response
                if (options.isAutoReconnect()) {
                    long ts = System.currentTimeMillis() - connection.getLastReceivedTime();
                    if (ts > options.getReceiveLimitMs()) {
                        log.warn("[Sub][" + connection.getConnectionId() + "] No response from server");
                        connection.reConnect(options.getConnectionDelayOnFailure());
                    }
                }
            } else if (connection.getState() == ConnectionState.DELAY_CONNECT) {
                connection.reConnect();
            } else if (connection.getState() == ConnectionState.CLOSED_ON_ERROR) {
                if (options.isAutoReconnect()) {
                    connection.reConnect(options.getConnectionDelayOnFailure());
                }
            }
        }), t, t, TimeUnit.MILLISECONDS);

        // Ping at regular interval to keep the websocket opened
        exec.scheduleAtFixedRate(() -> {
            TIME_HELPER.forEach(connection -> {
                if (connection.getState() == ConnectionState.CONNECTED) {
                    connection.ping();
                }
            });
        }, options.getPingInterval(), options.getPingInterval(), TimeUnit.MILLISECONDS);

        Runtime.getRuntime().addShutdownHook(new Thread(exec::shutdown));
    }

    void onConnectionCreated(WebSocketConnection connection) {
        TIME_HELPER.addIfAbsent(connection);
    }

    void onClosedNormally(WebSocketConnection connection) {
        TIME_HELPER.remove(connection);
    }
}
