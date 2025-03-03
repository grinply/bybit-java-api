package com.grinply.api.client.domain.trade.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmendOrderRequest {
    private String category;
    private String symbol;
    private String orderId;
    private String orderLinkId;
    private String qty;
    private String price;
    private String tpslMode;
    private String triggerPrice;
    private String orderIv;
    private String takeProfit;
    private String stopLoss;
    private String triggerBy;
    private String tpTriggerBy;
    private String slTriggerBy;
    private String tpLimitPrice;
    private String slLimitPrice;
}
