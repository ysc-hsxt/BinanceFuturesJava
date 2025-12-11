package com.binance.client.model.trade;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class AlgoOrder {

    private Long algoId;

    private String clientAlgoId;

    private String algoType;

    private String orderType;

    private String symbol;

    private String side;

    private String positionSide;

    private String timeInForce;

    private BigDecimal quantity;

    private String algoStatus;

    private String actualOrderId;

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    private BigDecimal actualPrice;

    private BigDecimal triggerPrice;

    private BigDecimal price;

    private String icebergQuantity;

    private String selfTradePreventionMode;

    private String workingType;

    private String priceMatch;

    private Boolean closePosition;

    private Boolean priceProtect;

    private Boolean reduceOnly;

    private BigDecimal activatePrice;

    private String callbackRate;

    private Long createTime;

    private Long updateTime;

    private Long triggerTime;

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

    public String getAlgoType() {
        return algoType;
    }

    public void setAlgoType(String algoType) {
        this.algoType = algoType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    public String getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(String timeInForce) {
        this.timeInForce = timeInForce;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getAlgoStatus() {
        return algoStatus;
    }

    public void setAlgoStatus(String algoStatus) {
        this.algoStatus = algoStatus;
    }

    public String getActualOrderId() {
        return actualOrderId;
    }

    public void setActualOrderId(String actualOrderId) {
        this.actualOrderId = actualOrderId;
    }

    public BigDecimal getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(BigDecimal triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIcebergQuantity() {
        return icebergQuantity;
    }

    public void setIcebergQuantity(String icebergQuantity) {
        this.icebergQuantity = icebergQuantity;
    }

    public String getSelfTradePreventionMode() {
        return selfTradePreventionMode;
    }

    public void setSelfTradePreventionMode(String selfTradePreventionMode) {
        this.selfTradePreventionMode = selfTradePreventionMode;
    }

    public String getWorkingType() {
        return workingType;
    }

    public void setWorkingType(String workingType) {
        this.workingType = workingType;
    }

    public String getPriceMatch() {
        return priceMatch;
    }

    public void setPriceMatch(String priceMatch) {
        this.priceMatch = priceMatch;
    }

    public Boolean getClosePosition() {
        return closePosition;
    }

    public void setClosePosition(Boolean closePosition) {
        this.closePosition = closePosition;
    }

    public Boolean getPriceProtect() {
        return priceProtect;
    }

    public void setPriceProtect(Boolean priceProtect) {
        this.priceProtect = priceProtect;
    }

    public Boolean getReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    public BigDecimal getActivatePrice() {
        return activatePrice;
    }

    public void setActivatePrice(BigDecimal activatePrice) {
        this.activatePrice = activatePrice;
    }

    public String getCallbackRate() {
        return callbackRate;
    }

    public void setCallbackRate(String callbackRate) {
        this.callbackRate = callbackRate;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Long triggerTime) {
        this.triggerTime = triggerTime;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("algoId", algoId).append("clientAlgoId", clientAlgoId).append("algoType", algoType).append("orderType", orderType)
                .append("symbol", symbol).append("side", side).append("positionSide", positionSide).append("timeInForce", timeInForce)
                .append("quantity", quantity).append("algoStatus", algoStatus).append("actualOrderId", actualOrderId).append("actualPrice", actualPrice).append("triggerPrice", triggerPrice).append("price", price)
                .append("icebergQuantity", icebergQuantity).append("selfTradePreventionMode", selfTradePreventionMode).append("workingType", workingType).append("priceMatch", priceMatch)
                .append("closePosition", closePosition).append("priceProtect", priceProtect).append("reduceOnly", reduceOnly).append("activatePrice", activatePrice).append("callbackRate", callbackRate)
                .append("createTime", createTime).append("updateTime", updateTime).append("triggerTime", triggerTime).toString();
    }
}

