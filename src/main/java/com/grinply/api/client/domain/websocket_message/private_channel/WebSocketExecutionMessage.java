package com.grinply.api.client.domain.websocket_message.private_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebSocketExecutionMessage {
    private String id;
    private String topic;
    private Long creationTime;
    private List<ExecutionData> data; // Assuming 'data' is an array of KlineData objects
}
