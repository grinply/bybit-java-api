package com.grinply.api.examples.http.sync;

import com.grinply.api.client.domain.spot.SpotMarginDataRequest;
import com.grinply.api.client.service.BybitApiClientFactory;

public class SpotLeverageExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET").newSpotMarginRestClient();

        // Get Leverage Token info
        var spotLeverageInfoRequest = SpotMarginDataRequest.builder().build();
        var spotLeverageTokenInfo = client.getSpotLeverageTokenInfo(spotLeverageInfoRequest);
        System.out.println(spotLeverageTokenInfo);

        // Get Leverage Token market
        var spotLeverageMarketRequest = SpotMarginDataRequest.builder().ltCoin("BTC3L").build();
        var spotLeverageTokenReference = client.getSpotLeverageTokenMarket(spotLeverageMarketRequest);
        System.out.println(spotLeverageTokenReference);

        var spotLeverageRequest = SpotMarginDataRequest.builder().ltCoin("BTC3L").ltAmount("10").quantity("10").build();
        // Purchase Leverage token
        var purchaseSpotLeverageResult = client.purchaseSpotLeverageToken(spotLeverageRequest);
        System.out.println(purchaseSpotLeverageResult);

        // Redeem Leverage token
        var redeemSpotLeverageResult = client.redeemSpotLeverageToken(spotLeverageRequest);
        System.out.println(redeemSpotLeverageResult);

        var spotLeverageRecordsRequest = SpotMarginDataRequest.builder().build();
        var spotLeverageRecords = client.getSpotLeverageRecords(spotLeverageRecordsRequest);
        System.out.println(spotLeverageRecords);
    }
}
