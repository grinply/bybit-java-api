package com.grinply.api.domain.spot_margin;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.restApi.BybitApiSpotMarginRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Test;

public class SpotMarginTradeTest {
    BybitApiSpotMarginRestClient client = BybitApiClientFactory.newInstance("xx", "xxx", BybitApiConfig.TESTNET_DOMAIN).newSpotMarginRestClient();

    @Test
    public void Test_MovePositions()
    {
        // Toggle Margin Trade
        var utaToggleMarginTradeResult = client.setUTASpotMarginTrade("0");
        System.out.println(utaToggleMarginTradeResult);

        // Set Leverage
        var utaLeverageResult = client.setUTASpotMarginTradeLeverage("2");
        System.out.println(utaLeverageResult);
    }
}
