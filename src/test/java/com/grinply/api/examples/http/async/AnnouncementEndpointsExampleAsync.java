package com.grinply.api.examples.http.async;

import com.grinply.api.client.domain.announcement.LanguageSymbol;
import com.grinply.api.client.domain.market.request.MarketDataRequest;
import com.grinply.api.client.service.BybitApiClientFactory;

public class AnnouncementEndpointsExampleAsync {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance().newAsyncMarketDataRestClient();

        // Get Announcement
        var announcementInfoRequest = MarketDataRequest.builder().locale(LanguageSymbol.EN_US).build();
        client.getAnnouncementInfo(announcementInfoRequest, System.out::println);
    }
}
