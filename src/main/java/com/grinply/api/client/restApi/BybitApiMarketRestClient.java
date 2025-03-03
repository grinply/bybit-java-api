package com.grinply.api.client.restApi;

import com.grinply.api.client.domain.market.request.MarketDataRequest;

public interface BybitApiMarketRestClient {
    // Market Data
    Object getServerTime();
    Object getMarketLinesData(MarketDataRequest marketKlineRequest);
    Object getMarketPriceLinesData(MarketDataRequest marketKlineRequest);
    Object getIndexPriceLinesData(MarketDataRequest marketKlineRequest);
    Object getPremiumIndexPriceLinesData(MarketDataRequest marketKlineRequest);
    Object getInstrumentsInfo(MarketDataRequest instrumentInfoRequest);
    Object getMarketOrderBook(MarketDataRequest marketOrderBookRequest);
    Object getMarketTickers(MarketDataRequest marketDataTickerRequest);
    Object getFundingHistory(MarketDataRequest fundingHistoryRequest);
    Object getRecentTradeData(MarketDataRequest recentTradeRequest);
    Object getOpenInterest(MarketDataRequest openInterestRequest);
    Object getHistoricalVolatility(MarketDataRequest HistoricalVolatilityRequest);
    Object getInsurance(MarketDataRequest marketDataRequest);
    Object getInsurance();
    Object getRiskLimit(MarketDataRequest marketRiskLimitRequest);
    Object getDeliveryPrice(MarketDataRequest deliveryPriceRequest);
    Object getMarketAccountRatio(MarketDataRequest marketAccountRatioRequest);
    Object getAnnouncementInfo(MarketDataRequest announcementInfoRequest);
}
