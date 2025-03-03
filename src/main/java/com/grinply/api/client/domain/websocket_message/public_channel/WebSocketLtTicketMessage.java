package com.grinply.api.client.domain.websocket_message.public_channel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebSocketLtTicketMessage {
    private String topic;
    private String type;
    private Long ts;
    private List<LtTicketData> data; // Assuming 'data' is an array of LtTicketData objects
}
