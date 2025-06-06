package com.grinply.api.domain.market;

import com.grinply.api.client.domain.CategoryType;
import com.grinply.api.client.domain.market.request.MarketDataRequest;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Test;

public class TickerInfoIndexPriceTest {
    @Test
    public void Test_IndexPrice()
    {
        var client = BybitApiClientFactory.newInstance().newAsyncMarketDataRestClient();

        var spotTickerRequest = MarketDataRequest.builder().category(CategoryType.SPOT).symbol("BTCUSDT").build();
        var inverseTickerRequest = MarketDataRequest.builder().category(CategoryType.INVERSE).symbol("BTCUSD").build();
        // spot ticker
        client.getMarketTickers(spotTickerRequest, System.out::println);
        // inverse ticker
        client.getMarketTickers(inverseTickerRequest, System.out::println);
    }
}
