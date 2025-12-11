package com.binance.client.model.trade;

import com.binance.client.model.ResponseResult;

public class CancelAlgoOrderResponseResult extends ResponseResult {
    public Long getAlgoId() {
        return algoId;
    }

    public void setAlgoId(Long algoId) {
        this.algoId = algoId;
    }

    public String getClientAlgoId() {
        return clientAlgoId;
    }

    public void setClientAlgoId(String clientAlgoId) {
        this.clientAlgoId = clientAlgoId;
    }

    private Long algoId;

    private String clientAlgoId;
}
