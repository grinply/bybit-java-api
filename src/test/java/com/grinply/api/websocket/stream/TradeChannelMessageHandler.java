package com.grinply.api.websocket.stream;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.websocket_message.public_channel.WebSocketTradeMessage;
import com.grinply.api.client.service.BybitApiClientFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class TradeChannelMessageHandler {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance(BybitApiConfig.STREAM_MAINNET_DOMAIN, true).newWebsocketClient();

        client.setMessageHandler(message -> {
            var tradeData = (new ObjectMapper()).readValue(message, WebSocketTradeMessage.class);
            // Process message data here
            System.out.println("Websocket Message Data: " + tradeData.getData().toString());
        });

        // Trade
        client.getPublicChannelStream(List.of("publicTrade.BTCUSDT"), BybitApiConfig.V5_PUBLIC_LINEAR);
    }
}
