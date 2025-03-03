package com.grinply.api.client.domain.websocket_message.public_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebSocketTickerMessage {
    private String topic;
    private Long ts;
    private String type;
    private Long cs;
    private PublicTickerData data;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCs() {
        return cs;
    }

    public void setCs(Long cs) {
        this.cs = cs;
    }

    public PublicTickerData getData() {
        return data;
    }

    public void setData(PublicTickerData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebSocketTickerMessage that = (WebSocketTickerMessage) o;
        return Objects.equals(topic, that.topic) && Objects.equals(ts, that.ts) && Objects.equals(type, that.type) && Objects.equals(cs, that.cs) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, ts, type, cs, data);
    }

    @Override
    public String toString() {
        return "WebSocketTickerMessage{" +
                "topic='" + topic + '\'' +
                ", ts=" + ts +
                ", type='" + type + '\'' +
                ", cs=" + cs +
                ", data=" + data +
                '}';
    }
}
