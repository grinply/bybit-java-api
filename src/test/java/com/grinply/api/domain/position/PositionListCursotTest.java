package com.grinply.api.domain.position;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.CategoryType;
import com.grinply.api.client.domain.position.request.PositionDataRequest;
import com.grinply.api.client.restApi.BybitApiPositionRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Ignore;
import org.junit.Test;

public class PositionListCursotTest {
    BybitApiPositionRestClient client = BybitApiClientFactory.newInstance("d08Wh6P037IXAvcrL2", "gLfd1BLGU9oq6YoRZRlwXkIQRYB4n5KvXDvv", BybitApiConfig.TESTNET_DOMAIN).newPositionRestClient();
    @Test
    @Ignore // TODO: replace credentials since they are not working
    public void Test_SwitchPositionMode()
    {
        var positionDataRequest = PositionDataRequest.builder().category(CategoryType.LINEAR).symbol("XRPUSDT").cursor("XRPUSDT%2C1709884800016%2C0").limit(1).build();
        var switchModeResult = client.getPositionInfo(positionDataRequest);
        System.out.println(switchModeResult);
    }
}
