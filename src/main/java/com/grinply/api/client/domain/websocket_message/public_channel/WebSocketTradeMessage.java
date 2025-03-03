package com.grinply.api.client.domain.websocket_message.public_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebSocketTradeMessage {
    private String id;
    private String topic;
    private String type;
    private Long ts;
    private List<TradeData> data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    public List<TradeData> getData() {
        return data;
    }

    public void setData(List<TradeData> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebSocketTradeMessage that = (WebSocketTradeMessage) o;
        return Objects.equals(id, that.id) && Objects.equals(topic, that.topic) && Objects.equals(type, that.type) && Objects.equals(ts, that.ts) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topic, type, ts, data);
    }

    @Override
    public String toString() {
        return "WebSocketTradeMessage{" +
                "id='" + id + '\'' +
                ", topic='" + topic + '\'' +
                ", type='" + type + '\'' +
                ", ts=" + ts +
                ", data=" + data +
                '}';
    }
}


