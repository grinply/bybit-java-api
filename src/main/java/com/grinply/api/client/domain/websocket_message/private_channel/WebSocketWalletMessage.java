package com.grinply.api.client.domain.websocket_message.private_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebSocketWalletMessage {
    private String id;
    private String topic;
    private Long creationTime;
    private List<WalletData> data; // Assuming 'data' is an array of KlineData objects


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

    public List<WalletData> getData() {
        return data;
    }

    public void setData(List<WalletData> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebSocketWalletMessage that = (WebSocketWalletMessage) o;
        return Objects.equals(id, that.id) && Objects.equals(topic, that.topic) && Objects.equals(creationTime, that.creationTime) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topic, creationTime, data);
    }

    @Override
    public String toString() {
        return "WebSocketWalletMessage{" +
                "id='" + id + '\'' +
                ", topic='" + topic + '\'' +
                ", creationTime=" + creationTime +
                ", data=" + data +
                '}';
    }
}
