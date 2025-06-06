package com.grinply.api.examples.Websocket.stream;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.service.BybitApiClientFactory;

import java.util.List;

public class WebsocketDebuggerExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance(BybitApiConfig.STREAM_TESTNET_DOMAIN, true).newWebsocketClient(20);

        // Orderbook
        client.getPublicChannelStream(List.of("orderbook.50.MATICUSDT"), BybitApiConfig.V5_PUBLIC_LINEAR);
    }
}
