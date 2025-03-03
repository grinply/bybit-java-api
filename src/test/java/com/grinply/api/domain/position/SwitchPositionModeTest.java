package com.grinply.api.domain.position;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.CategoryType;
import com.grinply.api.client.domain.position.PositionMode;
import com.grinply.api.client.domain.position.request.PositionDataRequest;
import com.grinply.api.client.restApi.BybitApiPositionRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Test;

public class SwitchPositionModeTest {
    BybitApiPositionRestClient client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newPositionRestClient();
    @Test
    public void Test_SwitchPositionMode()
    {
        var switchPositionMode = PositionDataRequest.builder().category(CategoryType.LINEAR).symbol("BTCUSDT").positionMode(PositionMode.MERGED_SINGLE).build();
        var switchModeResult = client.switchPositionMode(switchPositionMode);
        System.out.println(switchModeResult);
    }
}
