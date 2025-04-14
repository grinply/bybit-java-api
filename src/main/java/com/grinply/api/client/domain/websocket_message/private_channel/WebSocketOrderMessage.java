package com.grinply.api.client.domain.websocket_message.private_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebSocketOrderMessage {
    private String id;
    private String topic;
    private Long creationTime;
    private List<OrderData> data; // Assuming 'data' is an array of KlineData objects


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

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public List<OrderData> getData() {
        return data;
    }

    public void setData(List<OrderData> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebSocketOrderMessage that = (WebSocketOrderMessage) o;
        return Objects.equals(id, that.id) && Objects.equals(topic, that.topic) && Objects.equals(creationTime, that.creationTime) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topic, creationTime, data);
    }

    @Override
    public String toString() {
        return "WebSocketOrderMessage{" +
                "id='" + id + '\'' +
                ", topic='" + topic + '\'' +
                ", creationTime=" + creationTime +
                ", data=" + data +
                '}';
    }
}
