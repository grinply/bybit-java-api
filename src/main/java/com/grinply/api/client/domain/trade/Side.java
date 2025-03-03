package com.grinply.api.client.domain.trade;

import lombok.Getter;

@Getter
public enum Side {
    BUY("Buy"),
    SELL("Sell");

    private final String transactionSide;

    Side(String transactionSide) {
        this.transactionSide = transactionSide;
    }
}

