package com.binance.client.model.trade;

public class TraderSummary {
    private String customerId;
    private String unit;
    private String tradeVol;
    private String rebateVol;
    private Long time;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTradeVol() {
        return tradeVol;
    }

    public void setTradeVol(String tradeVol) {
        this.tradeVol = tradeVol;
    }

    public String getRebateVol() {
        return rebateVol;
    }

    public void setRebateVol(String rebateVol) {
        this.rebateVol = rebateVol;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TraderSummary{" +
                "customerId='" + customerId + '\'' +
                ", unit='" + unit + '\'' +
                ", tradeVol='" + tradeVol + '\'' +
                ", rebateVol='" + rebateVol + '\'' +
                ", time=" + time +
                '}';
    }
}
