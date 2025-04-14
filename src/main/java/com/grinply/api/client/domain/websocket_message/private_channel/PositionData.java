package com.grinply.api.client.domain.websocket_message.private_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionData {
    private String category;
    private String symbol;
    private String side;
    private String size;
    private Integer positionIdx;
    private Integer tradeMode;
    private String positionValue;
    private Integer riskId;
    private String riskLimitValue;
    private String entryPrice;
    private String markPrice;
    private String leverage;
    private String positionBalance;
    private Integer autoAddMargin;
    private String positionMM;
    private String positionIM;
    private String liqPrice;
    private String bustPrice;
    private String tpslMode;
    private String takeProfit;
    private String stopLoss;
    private String trailingStop;
    private String unrealisedPnl;
    private String curRealisedPnl;
    private String cumRealisedPnl;
    private String positionStatus;
    private Integer adlRankIndicator;
    private Boolean isReduceOnly;
    private String mmrSysUpdatedTime;
    private String leverageSysUpdatedTime;
    private String createdTime;
    private String updatedTime;
    private Long seq;

    public PositionData(){

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

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getPositionIdx() {
        return positionIdx;
    }

    public void setPositionIdx(Integer positionIdx) {
        this.positionIdx = positionIdx;
    }

    public Integer getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(Integer tradeMode) {
        this.tradeMode = tradeMode;
    }

    public String getPositionValue() {
        return positionValue;
    }

    public void setPositionValue(String positionValue) {
        this.positionValue = positionValue;
    }

    public Integer getRiskId() {
        return riskId;
    }

    public void setRiskId(Integer riskId) {
        this.riskId = riskId;
    }

    public String getRiskLimitValue() {
        return riskLimitValue;
    }

    public void setRiskLimitValue(String riskLimitValue) {
        this.riskLimitValue = riskLimitValue;
    }

    public String getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(String entryPrice) {
        this.entryPrice = entryPrice;
    }

    public String getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(String markPrice) {
        this.markPrice = markPrice;
    }

    public String getLeverage() {
        return leverage;
    }

    public void setLeverage(String leverage) {
        this.leverage = leverage;
    }

    public String getPositionBalance() {
        return positionBalance;
    }

    public void setPositionBalance(String positionBalance) {
        this.positionBalance = positionBalance;
    }

    public Integer getAutoAddMargin() {
        return autoAddMargin;
    }

    public void setAutoAddMargin(Integer autoAddMargin) {
        this.autoAddMargin = autoAddMargin;
    }

    public String getPositionMM() {
        return positionMM;
    }

    public void setPositionMM(String positionMM) {
        this.positionMM = positionMM;
    }

    public String getPositionIM() {
        return positionIM;
    }

    public void setPositionIM(String positionIM) {
        this.positionIM = positionIM;
    }

    public String getLiqPrice() {
        return liqPrice;
    }

    public void setLiqPrice(String liqPrice) {
        this.liqPrice = liqPrice;
    }

    public String getBustPrice() {
        return bustPrice;
    }

    public void setBustPrice(String bustPrice) {
        this.bustPrice = bustPrice;
    }

    public String getTpslMode() {
        return tpslMode;
    }

    public void setTpslMode(String tpslMode) {
        this.tpslMode = tpslMode;
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

    public String getTrailingStop() {
        return trailingStop;
    }

    public void setTrailingStop(String trailingStop) {
        this.trailingStop = trailingStop;
    }

    public String getUnrealisedPnl() {
        return unrealisedPnl;
    }

    public void setUnrealisedPnl(String unrealisedPnl) {
        this.unrealisedPnl = unrealisedPnl;
    }

    public String getCurRealisedPnl() {
        return curRealisedPnl;
    }

    public void setCurRealisedPnl(String curRealisedPnl) {
        this.curRealisedPnl = curRealisedPnl;
    }

    public String getCumRealisedPnl() {
        return cumRealisedPnl;
    }

    public void setCumRealisedPnl(String cumRealisedPnl) {
        this.cumRealisedPnl = cumRealisedPnl;
    }

    public String getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(String positionStatus) {
        this.positionStatus = positionStatus;
    }

    public Integer getAdlRankIndicator() {
        return adlRankIndicator;
    }

    public void setAdlRankIndicator(Integer adlRankIndicator) {
        this.adlRankIndicator = adlRankIndicator;
    }

    public Boolean getReduceOnly() {
        return isReduceOnly;
    }

    public void setReduceOnly(Boolean reduceOnly) {
        isReduceOnly = reduceOnly;
    }

    public String getMmrSysUpdatedTime() {
        return mmrSysUpdatedTime;
    }

    public void setMmrSysUpdatedTime(String mmrSysUpdatedTime) {
        this.mmrSysUpdatedTime = mmrSysUpdatedTime;
    }

    public String getLeverageSysUpdatedTime() {
        return leverageSysUpdatedTime;
    }

    public void setLeverageSysUpdatedTime(String leverageSysUpdatedTime) {
        this.leverageSysUpdatedTime = leverageSysUpdatedTime;
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

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "PositionData{" +
                "category='" + category + '\'' +
                ", symbol='" + symbol + '\'' +
                ", side='" + side + '\'' +
                ", size='" + size + '\'' +
                ", positionIdx=" + positionIdx +
                ", tradeMode=" + tradeMode +
                ", positionValue='" + positionValue + '\'' +
                ", riskId=" + riskId +
                ", riskLimitValue='" + riskLimitValue + '\'' +
                ", entryPrice='" + entryPrice + '\'' +
                ", markPrice='" + markPrice + '\'' +
                ", leverage='" + leverage + '\'' +
                ", positionBalance='" + positionBalance + '\'' +
                ", autoAddMargin=" + autoAddMargin +
                ", positionMM='" + positionMM + '\'' +
                ", positionIM='" + positionIM + '\'' +
                ", liqPrice='" + liqPrice + '\'' +
                ", bustPrice='" + bustPrice + '\'' +
                ", tpslMode='" + tpslMode + '\'' +
                ", takeProfit='" + takeProfit + '\'' +
                ", stopLoss='" + stopLoss + '\'' +
                ", trailingStop='" + trailingStop + '\'' +
                ", unrealisedPnl='" + unrealisedPnl + '\'' +
                ", curRealisedPnl='" + curRealisedPnl + '\'' +
                ", cumRealisedPnl='" + cumRealisedPnl + '\'' +
                ", positionStatus='" + positionStatus + '\'' +
                ", adlRankIndicator=" + adlRankIndicator +
                ", isReduceOnly=" + isReduceOnly +
                ", mmrSysUpdatedTime='" + mmrSysUpdatedTime + '\'' +
                ", leverageSysUpdatedTime='" + leverageSysUpdatedTime + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", updatedTime='" + updatedTime + '\'' +
                ", seq=" + seq +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionData that = (PositionData) o;
        return Objects.equals(category, that.category) && Objects.equals(symbol, that.symbol) && Objects.equals(side, that.side) && Objects.equals(size, that.size) && Objects.equals(positionIdx, that.positionIdx) && Objects.equals(tradeMode, that.tradeMode) && Objects.equals(positionValue, that.positionValue) && Objects.equals(riskId, that.riskId) && Objects.equals(riskLimitValue, that.riskLimitValue) && Objects.equals(entryPrice, that.entryPrice) && Objects.equals(markPrice, that.markPrice) && Objects.equals(leverage, that.leverage) && Objects.equals(positionBalance, that.positionBalance) && Objects.equals(autoAddMargin, that.autoAddMargin) && Objects.equals(positionMM, that.positionMM) && Objects.equals(positionIM, that.positionIM) && Objects.equals(liqPrice, that.liqPrice) && Objects.equals(bustPrice, that.bustPrice) && Objects.equals(tpslMode, that.tpslMode) && Objects.equals(takeProfit, that.takeProfit) && Objects.equals(stopLoss, that.stopLoss) && Objects.equals(trailingStop, that.trailingStop) && Objects.equals(unrealisedPnl, that.unrealisedPnl) && Objects.equals(curRealisedPnl, that.curRealisedPnl) && Objects.equals(cumRealisedPnl, that.cumRealisedPnl) && Objects.equals(positionStatus, that.positionStatus) && Objects.equals(adlRankIndicator, that.adlRankIndicator) && Objects.equals(isReduceOnly, that.isReduceOnly) && Objects.equals(mmrSysUpdatedTime, that.mmrSysUpdatedTime) && Objects.equals(leverageSysUpdatedTime, that.leverageSysUpdatedTime) && Objects.equals(createdTime, that.createdTime) && Objects.equals(updatedTime, that.updatedTime) && Objects.equals(seq, that.seq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, symbol, side, size, positionIdx, tradeMode, positionValue, riskId, riskLimitValue, entryPrice, markPrice, leverage, positionBalance, autoAddMargin, positionMM, positionIM, liqPrice, bustPrice, tpslMode, takeProfit, stopLoss, trailingStop, unrealisedPnl, curRealisedPnl, cumRealisedPnl, positionStatus, adlRankIndicator, isReduceOnly, mmrSysUpdatedTime, leverageSysUpdatedTime, createdTime, updatedTime, seq);
    }
}
