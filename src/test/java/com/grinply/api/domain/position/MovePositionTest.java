package com.grinply.api.domain.position;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.CategoryType;
import com.grinply.api.client.domain.position.MovePositionStatus;
import com.grinply.api.client.domain.position.request.BatchMovePositionRequest;
import com.grinply.api.client.domain.position.request.MovePositionDetailsRequest;
import com.grinply.api.client.domain.position.request.PositionDataRequest;
import com.grinply.api.client.domain.trade.Side;
import com.grinply.api.client.restApi.BybitApiPositionRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Test;

import java.util.Arrays;

public class MovePositionTest {
    BybitApiPositionRestClient client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newPositionRestClient();
    @Test
    public void Test_MovePositionHistory()
    {
        var movePositionsHistoryRequest = PositionDataRequest.builder().category(CategoryType.LINEAR).symbol("BTCUSDT").status(MovePositionStatus.Processing).build();
        var movePositionResult = client.getMovePositionHistory(movePositionsHistoryRequest);
        System.out.println(movePositionResult);
    }

    @Test
    public void Test_MovePositions()
    {
        var movePositionsRequest = Arrays.asList(MovePositionDetailsRequest.builder().category(CategoryType.SPOT.getCategoryTypeId()).symbol("BTCUSDT").side(Side.SELL.getTransactionSide()).price("100").qty("0.01").build(),
                MovePositionDetailsRequest.builder().category(CategoryType.SPOT.getCategoryTypeId()).symbol("ETHUSDT").side(Side.SELL.getTransactionSide()).price("100").qty("0.01").build());
        var batchMovePositionsRequest = BatchMovePositionRequest.builder().fromUid("123456").toUid("456789").list(movePositionsRequest).build();
        var movePositionResult = client.batchMovePositions(batchMovePositionsRequest);
        System.out.println(movePositionResult);
    }
}
