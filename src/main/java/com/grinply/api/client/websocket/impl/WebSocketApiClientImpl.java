package com.grinply.api.client.websocket.impl;

import com.grinply.api.client.exception.BybitApiException;
import com.grinply.api.client.security.SignatureGenerator;
import com.grinply.api.client.util.RequestBuilder;
import com.grinply.api.client.websocket.api.WebSocketApiAuth;
import com.grinply.api.client.websocket.api.WebSocketApiTrade;
import com.grinply.api.client.websocket.callback.*;
import com.grinply.api.client.websocket.enums.Category;
import com.grinply.api.client.websocket.httpclient.WebSocketApiClient;
import com.grinply.api.client.websocket.httpclient.WebSocketApiHttpClientSingleton;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import static com.grinply.api.client.config.BybitApiConfig.*;

public class WebSocketApiClientImpl implements WebSocketApiClient {
    private static final OkHttpClient client = WebSocketApiHttpClientSingleton.getHttpClient();
    private final SignatureGenerator signatureGenerator;
    private final String apiKey;
    private final String baseUrl;
    private final WebSocketOpenCallback noopOpenCallback = response -> { };
    private final WebSocketClosingCallback noopClosingCallback = (code, reason) -> { };
    private final WebSocketClosedCallback noopClosedCallback = (code, reason) -> { };
    private final WebSocketFailureCallback noopFailureCallback = (throwable, response) -> { };
    private WebSocketConnection connection;
    private WebSocketApiRequestHandler requestHandler;

    public WebSocketApiClientImpl() {
        this("", null);
    }

    public WebSocketApiClientImpl(String baseUrl) {
        this("", null, baseUrl);
    }

    public WebSocketApiClientImpl(String apiKey, SignatureGenerator signatureGenerator) {
        this(apiKey, signatureGenerator, STREAM_MAINNET_DOMAIN + V5_TRADE);
    }

    public WebSocketApiClientImpl(String apiKey, SignatureGenerator signatureGenerator, String baseUrl) {
        this.apiKey = apiKey;
        this.signatureGenerator = signatureGenerator;
        this.baseUrl = baseUrl;
    }

    private void checkRequestHandler() {
        if (this.requestHandler == null) {
            throw new BybitApiException("No WebSocket API connection to submit request. Please connect first.");
        }
    }

    @Override
    public void connect(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        Request request = RequestBuilder.buildWebSocketRequest(baseUrl);

        this.connection = new WebSocketConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request, client);
        this.requestHandler = new WebSocketApiRequestHandler(this.connection, this.apiKey, this.signatureGenerator);
        this.connection.connect();
    }

    @Override
    public void connect(WebSocketMessageCallback onMessageCallback) {
        connect(noopOpenCallback, onMessageCallback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    @Override
    public void close() {
        this.connection.close();
        client.dispatcher().executorService().shutdown();
    }

    @Override
    public WebSocketApiAuth auth() {
        checkRequestHandler();
        return (WebSocketApiAuth) WebSocketApiModuleFactory.build(Category.AUTH, this.requestHandler);
    }

    @Override
    public WebSocketApiTrade trade() {
        checkRequestHandler();
        return (WebSocketApiTrade) WebSocketApiModuleFactory.build(Category.TRADE, this.requestHandler);
    }

}
