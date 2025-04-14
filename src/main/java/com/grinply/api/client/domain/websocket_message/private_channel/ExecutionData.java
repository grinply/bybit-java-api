package com.grinply.api.client.domain.websocket_message.private_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExecutionData {
    private String category;
    private String symbol;
    private String isLeverage;
    private String orderId;
    private String orderLinkId;
    private String side;
    private String orderPrice;
    private String orderQty;
    private String leavesQty;
    private String createType;
    private String orderType;
    private String stopOrderType;
    private String execFee;
    private String execId;
    private String execPrice;
    private String execQty;
    private String execType;
    private String execValue;
    private String execTime;
    private Boolean isMaker;
    private String feeRate;
    private String tradeIv;
    private String markIv;
    private String markPrice;
    private String indexPrice;
    private String underlyingPrice;
    private String blockTradeId;
    private String closedSize;
    private Long seq;

    public ExecutionData(){

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getIsLeverage() {
        return isLeverage;
    }

    public void setIsLeverage(String isLeverage) {
        this.isLeverage = isLeverage;
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

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(String orderQty) {
        this.orderQty = orderQty;
    }

    public String getLeavesQty() {
        return leavesQty;
    }

    public void setLeavesQty(String leavesQty) {
        this.leavesQty = leavesQty;
    }

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
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

    public String getExecFee() {
        return execFee;
    }

    public void setExecFee(String execFee) {
        this.execFee = execFee;
    }

    public String getExecId() {
        return execId;
    }

    public void setExecId(String execId) {
        this.execId = execId;
    }

    public String getExecPrice() {
        return execPrice;
    }

    public void setExecPrice(String execPrice) {
        this.execPrice = execPrice;
    }

    public String getExecQty() {
        return execQty;
    }

    public void setExecQty(String execQty) {
        this.execQty = execQty;
    }

    public String getExecType() {
        return execType;
    }

    public void setExecType(String execType) {
        this.execType = execType;
    }

    public String getExecValue() {
        return execValue;
    }

    public void setExecValue(String execValue) {
        this.execValue = execValue;
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    public Boolean getMaker() {
        return isMaker;
    }

    public void setMaker(Boolean maker) {
        isMaker = maker;
    }

    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public String getTradeIv() {
        return tradeIv;
    }

    public void setTradeIv(String tradeIv) {
        this.tradeIv = tradeIv;
    }

    public String getMarkIv() {
        return markIv;
    }

    public void setMarkIv(String markIv) {
        this.markIv = markIv;
    }

    public String getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(String markPrice) {
        this.markPrice = markPrice;
    }

    public String getIndexPrice() {
        return indexPrice;
    }

    public void setIndexPrice(String indexPrice) {
        this.indexPrice = indexPrice;
    }

    public String getUnderlyingPrice() {
        return underlyingPrice;
    }

    public void setUnderlyingPrice(String underlyingPrice) {
        this.underlyingPrice = underlyingPrice;
    }

    public String getBlockTradeId() {
        return blockTradeId;
    }

    public void setBlockTradeId(String blockTradeId) {
        this.blockTradeId = blockTradeId;
    }

    public String getClosedSize() {
        return closedSize;
    }

    public void setClosedSize(String closedSize) {
        this.closedSize = closedSize;
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExecutionData that = (ExecutionData) o;
        return Objects.equals(category, that.category) && Objects.equals(symbol, that.symbol) && Objects.equals(isLeverage, that.isLeverage) && Objects.equals(orderId, that.orderId) && Objects.equals(orderLinkId, that.orderLinkId) && Objects.equals(side, that.side) && Objects.equals(orderPrice, that.orderPrice) && Objects.equals(orderQty, that.orderQty) && Objects.equals(leavesQty, that.leavesQty) && Objects.equals(createType, that.createType) && Objects.equals(orderType, that.orderType) && Objects.equals(stopOrderType, that.stopOrderType) && Objects.equals(execFee, that.execFee) && Objects.equals(execId, that.execId) && Objects.equals(execPrice, that.execPrice) && Objects.equals(execQty, that.execQty) && Objects.equals(execType, that.execType) && Objects.equals(execValue, that.execValue) && Objects.equals(execTime, that.execTime) && Objects.equals(isMaker, that.isMaker) && Objects.equals(feeRate, that.feeRate) && Objects.equals(tradeIv, that.tradeIv) && Objects.equals(markIv, that.markIv) && Objects.equals(markPrice, that.markPrice) && Objects.equals(indexPrice, that.indexPrice) && Objects.equals(underlyingPrice, that.underlyingPrice) && Objects.equals(blockTradeId, that.blockTradeId) && Objects.equals(closedSize, that.closedSize) && Objects.equals(seq, that.seq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, symbol, isLeverage, orderId, orderLinkId, side, orderPrice, orderQty, leavesQty, createType, orderType, stopOrderType, execFee, execId, execPrice, execQty, execType, execValue, execTime, isMaker, feeRate, tradeIv, markIv, markPrice, indexPrice, underlyingPrice, blockTradeId, closedSize, seq);
    }

    @Override
    public String toString() {
        return "ExecutionData{" +
                "category='" + category + '\'' +
                ", symbol='" + symbol + '\'' +
                ", isLeverage='" + isLeverage + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderLinkId='" + orderLinkId + '\'' +
                ", side='" + side + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                ", orderQty='" + orderQty + '\'' +
                ", leavesQty='" + leavesQty + '\'' +
                ", createType='" + createType + '\'' +
                ", orderType='" + orderType + '\'' +
                ", stopOrderType='" + stopOrderType + '\'' +
                ", execFee='" + execFee + '\'' +
                ", execId='" + execId + '\'' +
                ", execPrice='" + execPrice + '\'' +
                ", execQty='" + execQty + '\'' +
                ", execType='" + execType + '\'' +
                ", execValue='" + execValue + '\'' +
                ", execTime='" + execTime + '\'' +
                ", isMaker=" + isMaker +
                ", feeRate='" + feeRate + '\'' +
                ", tradeIv='" + tradeIv + '\'' +
                ", markIv='" + markIv + '\'' +
                ", markPrice='" + markPrice + '\'' +
                ", indexPrice='" + indexPrice + '\'' +
                ", underlyingPrice='" + underlyingPrice + '\'' +
                ", blockTradeId='" + blockTradeId + '\'' +
                ", closedSize='" + closedSize + '\'' +
                ", seq=" + seq +
                '}';
    }
}
