package com.grinply.api.client.restApi;

import com.grinply.api.client.domain.broker.request.BrokerDataRequest;

public interface BybitApiAsyncBrokerRestClient {
    // Broker endpoints
    void getBrokerEarningData(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);
    void getBrokerAccountInfo(BybitApiCallback<Object> callback);
    void getSubAccountsDeposits(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);
    void getSubAccountsDeposits(BybitApiCallback<Object> callback);
    void getVoucherSpec(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);
    void issueVoucher(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);
    void getIssuedVoucher(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);
}
