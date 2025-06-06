package com.grinply.api.client.impl;

import com.grinply.api.client.restApi.BybitApiAsyncBrokerRestClient;
import com.grinply.api.client.restApi.BybitApiCallback;
import com.grinply.api.client.restApi.BybitApiService;
import com.grinply.api.client.domain.broker.request.BrokerDataRequest;
import com.grinply.api.client.service.BybitJsonConverter;

import static com.grinply.api.client.service.BybitApiServiceGenerator.createService;

public class BybitApiAsyncBrokerRestClientImpl implements BybitApiAsyncBrokerRestClient {
    private final BybitApiService bybitApiService;
    private final BybitJsonConverter converter = new BybitJsonConverter();
    public BybitApiAsyncBrokerRestClientImpl(String apiKey, String secret, String baseUrl, boolean debugMode, long recvWindow, String logOption) {
        bybitApiService = createService(BybitApiService.class, apiKey, secret, baseUrl, debugMode, recvWindow, logOption, "");
    }

    @Override
    public void getBrokerEarningData(BrokerDataRequest brokerEarningRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getBrokerEarningData(
                brokerEarningRequest.getBizType() == null ? null : brokerEarningRequest.getBizType().getType(),
                brokerEarningRequest.getStartTime(),
                brokerEarningRequest.getEndTime(),
                brokerEarningRequest.getLimit(),
                brokerEarningRequest.getCursor()
        ).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getBrokerAccountInfo(BybitApiCallback<Object> callback) {
        bybitApiService.getBrokerAccountInfo().enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getSubAccountsDeposits(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getBrokerSubDeposits(
                brokerDataRequest.getSubMemberId(),
                brokerDataRequest.getCoin(),
                brokerDataRequest.getStartTime(),
                brokerDataRequest.getEndTime(),
                brokerDataRequest.getLimit(),
                brokerDataRequest.getCursor()
        ).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getSubAccountsDeposits(BybitApiCallback<Object> callback) {
        bybitApiService.getBrokerSubDeposits().enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getVoucherSpec(BrokerDataRequest voucherSpecRequest, BybitApiCallback<Object> callback) {
        var request = converter.mapToBrokerVoucherSpecRequest(voucherSpecRequest);
        bybitApiService.getVoucherSpec(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void issueVoucher(BrokerDataRequest issueVoucherRequest, BybitApiCallback<Object> callback) {
        var request = converter.mapToBrokerIssueVoucherRequest(issueVoucherRequest);
        bybitApiService.issueVoucher(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getIssuedVoucher(BrokerDataRequest getIssuedVoucherRequest, BybitApiCallback<Object> callback) {
        var request = converter.mapToBrokerGetIssuedVoucherRequest(getIssuedVoucherRequest);
        bybitApiService.getIssuedVoucher(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }
}
