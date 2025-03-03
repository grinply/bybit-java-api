package com.grinply.api.client.domain.position;

import lombok.Getter;

@Getter
public enum ExecType {
    Trade("Trade"),
    AdlTrade("AdlTrade"), //Auto-Deleveraging
    Funding("Funding"), //Funding fee
    BustTrade("BustTrade"), //Liquidation
    Delivery("Delivery"), //USDC futures delivery
    BlockTrade("BlockTrade");

    private final String execTypeId;

    ExecType(String execTypeId) {
        this.execTypeId = execTypeId;
    }
}
