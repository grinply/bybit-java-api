package com.grinply.api.client.websocket.httpclient;

import com.grinply.api.client.websocket.api.WebSocketApiAuth;
import com.grinply.api.client.websocket.api.WebSocketApiTrade;
import com.grinply.api.client.websocket.callback.*;

public interface WebSocketApiClient {
    void connect(WebSocketMessageCallback onMessageCallback);
    void connect(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    void close();
    WebSocketApiAuth auth();
    WebSocketApiTrade trade();
}
