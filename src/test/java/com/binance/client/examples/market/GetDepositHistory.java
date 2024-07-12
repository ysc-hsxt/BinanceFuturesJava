package com.binance.client.examples.market;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.wallet.Deposit;

import java.util.List;

public class GetDepositHistory {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        List<Deposit> deposits = syncRequestClient.getDepositHistory();

        System.out.println(deposits.get(0).getAmount());
    }
}
