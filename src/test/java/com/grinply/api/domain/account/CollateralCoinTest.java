package com.grinply.api.domain.account;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.account.CollateralSwitch;
import com.grinply.api.client.domain.account.request.AccountDataRequest;
import com.grinply.api.client.domain.account.request.BatchSetCollateralCoinRequest;
import com.grinply.api.client.domain.account.request.SetCollateralCoinRequest;
import com.grinply.api.client.restApi.BybitApiAccountRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Test;

import java.util.Arrays;

public class CollateralCoinTest {
    BybitApiAccountRestClient client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newAccountRestClient();
    @Test
    public void Test_SetCollateralCoin()
    {
        var setCollateralCoinRequest = AccountDataRequest.builder().coin("MATIC").collateralSwitch(CollateralSwitch.OFF).build();
        var setCollateralCoinResult = client.setAccountCollateralCoin(setCollateralCoinRequest);
        System.out.println(setCollateralCoinResult);
    }

    @Test
    public void Test_BatchSetCollateralCoin()
    {
        var batchSetCollateralCoinRequest = Arrays.asList(SetCollateralCoinRequest.builder().coin("MATIC").collateralSwitch(CollateralSwitch.OFF.getCollateralSwitchMode()).build(),
                SetCollateralCoinRequest.builder().coin("SOL").collateralSwitch(CollateralSwitch.OFF.getCollateralSwitchMode()).build());
        var batchSetCollateral = BatchSetCollateralCoinRequest.builder().request(batchSetCollateralCoinRequest).build();
        var batchSetCollateralCoinResult = client.batchSetAccountCollateralCoin(batchSetCollateral);
        System.out.println(batchSetCollateralCoinResult);
    }
}
