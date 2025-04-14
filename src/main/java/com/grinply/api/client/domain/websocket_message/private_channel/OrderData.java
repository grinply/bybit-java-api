package com.grinply.api.client.domain.websocket_message.private_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderData {
    private String category;
    private String orderId;
    private String orderLinkId;
    private String isLeverage;
    private String blockTradeId;
    private String symbol;
    private String price;
    private String qty;
    private String side;
    private Integer positionIdx;
    private String orderStatus;
    private String createType;
    private String cancelType;
    private String rejectReason;
    private String avgPrice;
    private String leavesQty;
    private String leavesValue;
    private String cumExecQty;
    private String cumExecValue;
    private String cumExecFee;
    private String feeCurrency;
    private String timeInForce;
    private String orderType;
    private String stopOrderType;
    private String ocoTriggerType;
    private String orderIv;
    private String marketUnit;
    private String triggerPrice;
    private String takeProfit;
    private String stopLoss;
    private String tpslMode;
    private String tpLimitPrice;
    private String slLimitPrice;
    private String tpTriggerBy;
    private String slTriggerBy;
    private Integer triggerDirection;
    private String triggerBy;
    private String lastPriceOnCreated;
    private Boolean reduceOnly;
    private Boolean closeOnTrigger;
    private String placeType;
    private String smpType;
    private Integer smpGroup;
    private String smpOrderId;
    private String createdTime;
    private String updatedTime;

    public OrderData(){

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderLinkId() {
        return orderLinkId;
    }

    public void setOrderLinkId(String orderLinkId) {
        this.orderLinkId = orderLinkId;
    }

    public String getIsLeverage() {
        return isLeverage;
    }

    public void setIsLeverage(String isLeverage) {
        this.isLeverage = isLeverage;
    }

    public String getBlockTradeId() {
        return blockTradeId;
    }

    public void setBlockTradeId(String blockTradeId) {
        this.blockTradeId = blockTradeId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public Integer getPositionIdx() {
        return positionIdx;
    }

    public void setPositionIdx(Integer positionIdx) {
        this.positionIdx = positionIdx;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public String getCancelType() {
        return cancelType;
    }

    public void setCancelType(String cancelType) {
        this.cancelType = cancelType;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
    }

    public String getLeavesQty() {
        return leavesQty;
    }

    public void setLeavesQty(String leavesQty) {
        this.leavesQty = leavesQty;
    }

    public String getLeavesValue() {
        return leavesValue;
    }

    public void setLeavesValue(String leavesValue) {
        this.leavesValue = leavesValue;
    }

    public String getCumExecQty() {
        return cumExecQty;
    }

    public void setCumExecQty(String cumExecQty) {
        this.cumExecQty = cumExecQty;
    }

    public String getCumExecValue() {
        return cumExecValue;
    }

    public void setCumExecValue(String cumExecValue) {
        this.cumExecValue = cumExecValue;
    }

    public String getCumExecFee() {
        return cumExecFee;
    }

    public void setCumExecFee(String cumExecFee) {
        this.cumExecFee = cumExecFee;
    }

    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    public String getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(String timeInForce) {
        this.timeInForce = timeInForce;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getStopOrderType() {
        return stopOrderType;
    }

    public void setStopOrderType(String stopOrderType) {
        this.stopOrderType = stopOrderType;
    }

    public String getOcoTriggerType() {
        return ocoTriggerType;
    }

    public void setOcoTriggerType(String ocoTriggerType) {
        this.ocoTriggerType = ocoTriggerType;
    }

    public String getOrderIv() {
        return orderIv;
    }

    public void setOrderIv(String orderIv) {
        this.orderIv = orderIv;
    }

    public String getMarketUnit() {
        return marketUnit;
    }

    public void setMarketUnit(String marketUnit) {
        this.marketUnit = marketUnit;
    }

    public String getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(String triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public String getTakeProfit() {
        return takeProfit;
    }

    public void setTakeProfit(String takeProfit) {
        this.takeProfit = takeProfit;
    }

    public String getStopLoss() {
        return stopLoss;
    }

    public void setStopLoss(String stopLoss) {
        this.stopLoss = stopLoss;
    }

    public String getTpslMode() {
        return tpslMode;
    }

    public void setTpslMode(String tpslMode) {
        this.tpslMode = tpslMode;
    }

    public String getTpLimitPrice() {
        return tpLimitPrice;
    }

    public void setTpLimitPrice(String tpLimitPrice) {
        this.tpLimitPrice = tpLimitPrice;
    }

    public String getSlLimitPrice() {
        return slLimitPrice;
    }

    public void setSlLimitPrice(String slLimitPrice) {
        this.slLimitPrice = slLimitPrice;
    }

    public String getTpTriggerBy() {
        return tpTriggerBy;
    }

    public void setTpTriggerBy(String tpTriggerBy) {
        this.tpTriggerBy = tpTriggerBy;
    }

    public String getSlTriggerBy() {
        return slTriggerBy;
    }

    public void setSlTriggerBy(String slTriggerBy) {
        this.slTriggerBy = slTriggerBy;
    }

    public Integer getTriggerDirection() {
        return triggerDirection;
    }

    public void setTriggerDirection(Integer triggerDirection) {
        this.triggerDirection = triggerDirection;
    }

    public String getTriggerBy() {
        return triggerBy;
    }

    public void setTriggerBy(String triggerBy) {
        this.triggerBy = triggerBy;
    }

    public String getLastPriceOnCreated() {
        return lastPriceOnCreated;
    }

    public void setLastPriceOnCreated(String lastPriceOnCreated) {
        this.lastPriceOnCreated = lastPriceOnCreated;
    }

    public Boolean getReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    public Boolean getCloseOnTrigger() {
        return closeOnTrigger;
    }

    public void setCloseOnTrigger(Boolean closeOnTrigger) {
        this.closeOnTrigger = closeOnTrigger;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public String getSmpType() {
        return smpType;
    }

    public void setSmpType(String smpType) {
        this.smpType = smpType;
    }

    public Integer getSmpGroup() {
        return smpGroup;
    }

    public void setSmpGroup(Integer smpGroup) {
        this.smpGroup = smpGroup;
    }

    public String getSmpOrderId() {
        return smpOrderId;
    }

    public void setSmpOrderId(String smpOrderId) {
        this.smpOrderId = smpOrderId;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderData orderData = (OrderData) o;
        return Objects.equals(category, orderData.category) && Objects.equals(orderId, orderData.orderId) && Objects.equals(orderLinkId, orderData.orderLinkId) && Objects.equals(isLeverage, orderData.isLeverage) && Objects.equals(blockTradeId, orderData.blockTradeId) && Objects.equals(symbol, orderData.symbol) && Objects.equals(price, orderData.price) && Objects.equals(qty, orderData.qty) && Objects.equals(side, orderData.side) && Objects.equals(positionIdx, orderData.positionIdx) && Objects.equals(orderStatus, orderData.orderStatus) && Objects.equals(createType, orderData.createType) && Objects.equals(cancelType, orderData.cancelType) && Objects.equals(rejectReason, orderData.rejectReason) && Objects.equals(avgPrice, orderData.avgPrice) && Objects.equals(leavesQty, orderData.leavesQty) && Objects.equals(leavesValue, orderData.leavesValue) && Objects.equals(cumExecQty, orderData.cumExecQty) && Objects.equals(cumExecValue, orderData.cumExecValue) && Objects.equals(cumExecFee, orderData.cumExecFee) && Objects.equals(feeCurrency, orderData.feeCurrency) && Objects.equals(timeInForce, orderData.timeInForce) && Objects.equals(orderType, orderData.orderType) && Objects.equals(stopOrderType, orderData.stopOrderType) && Objects.equals(ocoTriggerType, orderData.ocoTriggerType) && Objects.equals(orderIv, orderData.orderIv) && Objects.equals(marketUnit, orderData.marketUnit) && Objects.equals(triggerPrice, orderData.triggerPrice) && Objects.equals(takeProfit, orderData.takeProfit) && Objects.equals(stopLoss, orderData.stopLoss) && Objects.equals(tpslMode, orderData.tpslMode) && Objects.equals(tpLimitPrice, orderData.tpLimitPrice) && Objects.equals(slLimitPrice, orderData.slLimitPrice) && Objects.equals(tpTriggerBy, orderData.tpTriggerBy) && Objects.equals(slTriggerBy, orderData.slTriggerBy) && Objects.equals(triggerDirection, orderData.triggerDirection) && Objects.equals(triggerBy, orderData.triggerBy) && Objects.equals(lastPriceOnCreated, orderData.lastPriceOnCreated) && Objects.equals(reduceOnly, orderData.reduceOnly) && Objects.equals(closeOnTrigger, orderData.closeOnTrigger) && Objects.equals(placeType, orderData.placeType) && Objects.equals(smpType, orderData.smpType) && Objects.equals(smpGroup, orderData.smpGroup) && Objects.equals(smpOrderId, orderData.smpOrderId) && Objects.equals(createdTime, orderData.createdTime) && Objects.equals(updatedTime, orderData.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, orderId, orderLinkId, isLeverage, blockTradeId, symbol, price, qty, side, positionIdx, orderStatus, createType, cancelType, rejectReason, avgPrice, leavesQty, leavesValue, cumExecQty, cumExecValue, cumExecFee, feeCurrency, timeInForce, orderType, stopOrderType, ocoTriggerType, orderIv, marketUnit, triggerPrice, takeProfit, stopLoss, tpslMode, tpLimitPrice, slLimitPrice, tpTriggerBy, slTriggerBy, triggerDirection, triggerBy, lastPriceOnCreated, reduceOnly, closeOnTrigger, placeType, smpType, smpGroup, smpOrderId, createdTime, updatedTime);
    }

    @Override
    public String toString() {
        return "OrderData{" +
                "category='" + category + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderLinkId='" + orderLinkId + '\'' +
                ", isLeverage='" + isLeverage + '\'' +
                ", blockTradeId='" + blockTradeId + '\'' +
                ", symbol='" + symbol + '\'' +
                ", price='" + price + '\'' +
                ", qty='" + qty + '\'' +
                ", side='" + side + '\'' +
                ", positionIdx=" + positionIdx +
                ", orderStatus='" + orderStatus + '\'' +
                ", createType='" + createType + '\'' +
                ", cancelType='" + cancelType + '\'' +
                ", rejectReason='" + rejectReason + '\'' +
                ", avgPrice='" + avgPrice + '\'' +
                ", leavesQty='" + leavesQty + '\'' +
                ", leavesValue='" + leavesValue + '\'' +
                ", cumExecQty='" + cumExecQty + '\'' +
                ", cumExecValue='" + cumExecValue + '\'' +
                ", cumExecFee='" + cumExecFee + '\'' +
                ", feeCurrency='" + feeCurrency + '\'' +
                ", timeInForce='" + timeInForce + '\'' +
                ", orderType='" + orderType + '\'' +
                ", stopOrderType='" + stopOrderType + '\'' +
                ", ocoTriggerType='" + ocoTriggerType + '\'' +
                ", orderIv='" + orderIv + '\'' +
                ", marketUnit='" + marketUnit + '\'' +
                ", triggerPrice='" + triggerPrice + '\'' +
                ", takeProfit='" + takeProfit + '\'' +
                ", stopLoss='" + stopLoss + '\'' +
                ", tpslMode='" + tpslMode + '\'' +
                ", tpLimitPrice='" + tpLimitPrice + '\'' +
                ", slLimitPrice='" + slLimitPrice + '\'' +
                ", tpTriggerBy='" + tpTriggerBy + '\'' +
                ", slTriggerBy='" + slTriggerBy + '\'' +
                ", triggerDirection=" + triggerDirection +
                ", triggerBy='" + triggerBy + '\'' +
                ", lastPriceOnCreated='" + lastPriceOnCreated + '\'' +
                ", reduceOnly=" + reduceOnly +
                ", closeOnTrigger=" + closeOnTrigger +
                ", placeType='" + placeType + '\'' +
                ", smpType='" + smpType + '\'' +
                ", smpGroup=" + smpGroup +
                ", smpOrderId='" + smpOrderId + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", updatedTime='" + updatedTime + '\'' +
                '}';
    }
}
