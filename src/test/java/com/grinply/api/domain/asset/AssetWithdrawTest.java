package com.grinply.api.domain.asset;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.account.AccountType;
import com.grinply.api.client.domain.asset.request.AssetDataRequest;
import com.grinply.api.client.restApi.BybitApiAssetRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Test;

import java.util.Map;

public class AssetWithdrawTest {
    BybitApiClientFactory factory = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN);
    BybitApiAssetRestClient client = factory.newAssetRestClient();

    @Test
    public void Test_AssetWithdraw() {
        Map<String, String> beneficiary = Map.of(
                "vaspEntityId", "test",
                "beneficiaryName", "test"
        );
        var assetWithdrawRequest = AssetDataRequest.builder().coin("USDT")
                .chain("ETH")
                .address("xxxxxxxx")
                .amount("100")
                .forceChain(0)
                .accountType(AccountType.FUND)
                .beneficiaryMap(beneficiary)
                .build();
        var subUser = client.createAssetWithdraw(assetWithdrawRequest);
        System.out.println(subUser);
    }
}
