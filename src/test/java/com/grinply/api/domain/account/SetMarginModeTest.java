package com.grinply.api.domain.account;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.account.request.AccountDataRequest;
import com.grinply.api.client.domain.position.MarginMode;
import com.grinply.api.client.restApi.BybitApiAccountRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Test;

public class SetMarginModeTest {
    BybitApiAccountRestClient client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newAccountRestClient();
    @Test
    public void Test_SetMarginMode()
    {
        var setAccountMarginModeRequest = AccountDataRequest.builder().setMarginMode(MarginMode.CROSS_MARGIN).build();
        var marginModeResult = client.setAccountMarginMode(setAccountMarginModeRequest);
        System.out.println(marginModeResult);
    }
}
