package com.grinply.api.examples.Websocket.stream;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.service.BybitApiClientFactory;

import java.util.List;

public class WebsocketPrivateChannelExamples {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.STREAM_TESTNET_DOMAIN, true).newWebsocketClient(5, "60s", (message) -> System.out.println("Handle message :" + message));
        // Position
        // client.getPrivateChannelStream(List.of("position"), BybitApiConfig.V5_PRIVATE);

        // Order
        var webSocket = client.getPrivateChannelStream(List.of("order"), BybitApiConfig.V5_PRIVATE);

        // Close websocket
        client.onClose(webSocket, 1000, "close normal");
    }
}
