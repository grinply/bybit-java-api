package com.grinply.api.client.domain.websocket_message.public_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KlineData {
    private Long start;
    private Long end;
    private String interval;
    private String open;
    private String close;
    private String high;
    private String low;
    private String volume;
    private String turnover;
    private Boolean confirm;
    private Long timestamp;

    public KlineData(){

    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getTurnover() {
        return turnover;
    }

    public void setTurnover(String turnover) {
        this.turnover = turnover;
    }

    public Boolean getConfirm() {
        return confirm;
    }

    public void setConfirm(Boolean confirm) {
        this.confirm = confirm;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KlineData klineData = (KlineData) o;
        return Objects.equals(start, klineData.start) && Objects.equals(end, klineData.end) && Objects.equals(interval, klineData.interval) && Objects.equals(open, klineData.open) && Objects.equals(close, klineData.close) && Objects.equals(high, klineData.high) && Objects.equals(low, klineData.low) && Objects.equals(volume, klineData.volume) && Objects.equals(turnover, klineData.turnover) && Objects.equals(confirm, klineData.confirm) && Objects.equals(timestamp, klineData.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, interval, open, close, high, low, volume, turnover, confirm, timestamp);
    }

    @Override
    public String toString() {
        return "KlineData{" +
                "start=" + start +
                ", end=" + end +
                ", interval='" + interval + '\'' +
                ", open='" + open + '\'' +
                ", close='" + close + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", volume='" + volume + '\'' +
                ", turnover='" + turnover + '\'' +
                ", confirm=" + confirm +
                ", timestamp=" + timestamp +
                '}';
    }
}
