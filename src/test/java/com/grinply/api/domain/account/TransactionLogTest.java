package com.grinply.api.domain.account;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.account.request.AccountDataRequest;
import com.grinply.api.client.domain.user.IsUta;
import com.grinply.api.client.restApi.BybitApiAccountRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Test;

public class TransactionLogTest {
    @Test
    public void Test_UTAAccountGetTransaction()
    {
        BybitApiAccountRestClient client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newAccountRestClient();
        var transactionLogRequest = AccountDataRequest.builder().build();
        var result = client.getTransactionLog(transactionLogRequest);
        System.out.println(result);
    }

    @Test
    public void Test_ClassicalAccountGetTransaction()
    {
        BybitApiAccountRestClient client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newAccountRestClient();
        var transactionLogRequest = AccountDataRequest.builder().isUta(IsUta.CLASSIC_ACCOUNT).build();
        var result = client.getTransactionLog(transactionLogRequest);
        System.out.println(result);
    }
}
