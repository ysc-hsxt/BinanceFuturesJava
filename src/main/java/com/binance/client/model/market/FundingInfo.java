package com.binance.client.model.market;

import java.math.BigDecimal;

public class FundingInfo {
    private String symbol;
    private BigDecimal adjustedFundingRateCap;
    private BigDecimal adjustedFundingRateFloor;
    private int fundingIntervalHours;
    private Boolean disclaimer;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getAdjustedFundingRateCap() {
        return adjustedFundingRateCap;
    }

    public void setAdjustedFundingRateCap(BigDecimal adjustedFundingRateCap) {
        this.adjustedFundingRateCap = adjustedFundingRateCap;
    }

    public BigDecimal getAdjustedFundingRateFloor() {
        return adjustedFundingRateFloor;
    }

    public void setAdjustedFundingRateFloor(BigDecimal adjustedFundingRateFloor) {
        this.adjustedFundingRateFloor = adjustedFundingRateFloor;
    }

    public int getFundingIntervalHours() {
        return fundingIntervalHours;
    }

    public void setFundingIntervalHours(int fundingIntervalHours) {
        this.fundingIntervalHours = fundingIntervalHours;
    }

    public Boolean getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(Boolean disclaimer) {
        this.disclaimer = disclaimer;
    }
}
