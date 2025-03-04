package com.grinply.api.client.domain;

import lombok.Getter;

@Getter
public enum TradeOrderType {
    MARKET("Market"),
    LIMIT("Limit"),
    UNKNOWN("UNKNOWN");  // Used in some responses, mainly when execType is Funding

    private final String oType;

    TradeOrderType(String oType) {
        this.oType = oType;
    }
}
