package com.grinply.api.examples.http.sync;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.CategoryType;
import com.grinply.api.client.domain.position.MarginMode;
import com.grinply.api.client.domain.position.request.PositionDataRequest;
import com.grinply.api.client.service.BybitApiClientFactory;

public class PositionDataExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newPositionRestClient();

        // Get Position Info
        var positionListRequest = PositionDataRequest.builder().category(CategoryType.LINEAR).symbol("BTCUSDT").build();
        var positionListData = client.getPositionInfo(positionListRequest);
        System.out.println(positionListData);

        // Set Leverage
        var setLeverageRequest = PositionDataRequest.builder().category(CategoryType.LINEAR).symbol("BTCUSDT").buyLeverage("5").sellLeverage("5").build();
        var setPositionLeverageResult = client.setPositionLeverage(setLeverageRequest);
        System.out.println(setPositionLeverageResult);

        // Get Close PnL History
        var closPnlRequest = PositionDataRequest.builder().category(CategoryType.LINEAR).build();
        var closePnLData = client.getClosePnlList(closPnlRequest);
        System.out.println(closePnLData);

        // Switch Cross/Isolated Margin
        var switchMarginRequest = PositionDataRequest.builder().category(CategoryType.LINEAR).symbol("BTC-31MAR23").tradeMode(MarginMode.CROSS_MARGIN).buyLeverage("5").sellLeverage("5").build();
        var switchMarginResult = client.swithMarginRequest(switchMarginRequest);
        System.out.println(switchMarginResult);

        // Confirm new position risk limit
        var confirmNewRiskRequest = PositionDataRequest.builder().category(CategoryType.LINEAR).symbol("BTCUSDT").build();
        var confirmRiskLimitResult = client.confirmPositionRiskLimit(confirmNewRiskRequest);
        System.out.println(confirmRiskLimitResult);
    }
}
