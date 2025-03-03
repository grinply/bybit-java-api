package com.grinply.api.domain.account;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.account.AccountType;
import com.grinply.api.client.domain.account.request.AccountDataRequest;
import com.grinply.api.client.restApi.BybitApiAccountRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Ignore;
import org.junit.Test;

public class AccountBalanceTest {
    BybitApiAccountRestClient client = BybitApiClientFactory.newInstance("d08Wh6P037IXAvcrL2", "gLfd1BLGU9oq6YoRZRlwXkIQRYB4n5KvXDvv", BybitApiConfig.TESTNET_DOMAIN).newAccountRestClient();

    @Test
    @Ignore // TODO: replace credentials since they are not working
    public void Test_GetAccountBalance() {
        var unifyWalletBalanceRequest = AccountDataRequest.builder().accountType(AccountType.UNIFIED).build();
        var result = client.getWalletBalance(unifyWalletBalanceRequest);
        System.out.println(result);
    }
}
