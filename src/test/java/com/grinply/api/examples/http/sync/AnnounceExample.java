package com.grinply.api.examples.http.sync;

import com.grinply.api.client.domain.announcement.LanguageSymbol;
import com.grinply.api.client.domain.market.request.MarketDataRequest;
import com.grinply.api.client.service.BybitApiClientFactory;

public class AnnounceExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance().newMarketDataRestClient();

        // Get Announcement
        var announcementInfoRequest = MarketDataRequest.builder().locale(LanguageSymbol.EN_US).build();
        var announceInfo = client.getAnnouncementInfo(announcementInfoRequest);
        System.out.println(announceInfo);
    }
}
