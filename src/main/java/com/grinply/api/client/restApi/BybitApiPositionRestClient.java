package com.grinply.api.client.restApi;

import com.grinply.api.client.domain.position.request.BatchMovePositionRequest;
import com.grinply.api.client.domain.position.request.PositionDataRequest;

public interface BybitApiPositionRestClient {
    // Position Data
    Object getPositionInfo(PositionDataRequest positionListRequest);
    Object setPositionLeverage(PositionDataRequest setLeverageRequest);
    Object swithMarginRequest(PositionDataRequest switchMarginRequest);
    Object switchPositionMode(PositionDataRequest switchPositionModeRequest);
    @Deprecated
    Object setTpslMode(PositionDataRequest setTpSlModeRequest);
    @Deprecated
    Object setRiskLimit(PositionDataRequest setRiskLimitRequest);
    Object setTradingStop(PositionDataRequest tradingStopRequest);
    Object setAutoAddMargin(PositionDataRequest setAutoAddMarginRequest);
    Object modifyPositionMargin(PositionDataRequest modifyMarginRequest);
    Object getClosePnlList(PositionDataRequest closePnlHistoryRequest);
    Object getMovePositionHistory(PositionDataRequest movePositionHistoryRequest);
    Object batchMovePositions(BatchMovePositionRequest batchMovePositionRequest);
    Object confirmPositionRiskLimit(PositionDataRequest confirmNewRiskLimitRequest);
}
