package com.grinply.api.client.domain.trade.request;

import com.grinply.api.client.domain.CategoryType;
import com.grinply.api.client.service.CategoryTypeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class PlaceBatchOrderRequest {
    @JsonSerialize(using = CategoryTypeSerializer.class)
    private CategoryType category;
    private List<PlaceOrderRequest> request;
}
