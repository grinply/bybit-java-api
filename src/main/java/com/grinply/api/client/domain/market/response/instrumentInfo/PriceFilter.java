package com.grinply.api.client.domain.market.response.instrumentInfo;

import lombok.Getter;

@Getter
public class PriceFilter {
    private String minPrice;
    private String maxPrice;
    private String tickSize;
}
