package com.grinply.api.domain.user;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.user.*;
import com.grinply.api.client.restApi.BybitApiUserRestClient;
import com.grinply.api.client.service.BybitApiClientFactory;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class UserCreatedTest {
    BybitApiUserRestClient client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newUserRestClient();

    @Test
    public void Test_GetUserInfo(){
        System.out.println(client.getCurrentAPIKeyInfo());
    }
    @Test
    public void Test_CreateMember() {
        var subUserRequest = UserDataRequest.builder().username("Test070620242")
                .password("Password123")
                .memberType(MemberType.NORMAL_SUB_ACCOUNT)
                .note("Some note 2")
                .switchOption(SwitchOption.TURN_ON)
                .isUta(IsUta.UTA_ACCOUNT)
                .build();
        var subUser = client.createSubMember(subUserRequest);
        System.out.println(subUser);
    }

    @Test
    public void Test_CreateSubApiKeyByClass() {
        Map<String, List<String>> permissionMap = Map.of(
                "ContractTrade", List.of("Order", "Position"),
                "Spot", List.of("SpotTrade"),
                "Wallet", List.of("AccountTransfer"),
                "Options", List.of("OptionsTrade"),
                "Derivatives", List.of("DerivativesTrade"),
                "Exchange", List.of("ExchangeHistory"),
                "CopyTrading", List.of("CopyTrading"),
                "BlockTrade", List.of("BlockTrade"),
                "NFT", List.of("NFTQueryProductList")
        );
        UserPermissionsMap permissions = UserPermissionsMap.builder().permissionMap(permissionMap).build();
        var subApiKeyRequest = UserDataRequest.builder().subuid(101472011)
                .readOnlyStatus(ReadOnlyStatus.READ_AND_WRITE)
                .userPermissionsMap(permissions)
                .ips(List.of("*"))
                .note("note test 20240911")
                .build();
        var subUser = client.createSubAPI(subApiKeyRequest);
        System.out.println(subUser);
    }

    @Test
    public void Test_CreateSubApiKeyByMap() {
        Map<String, List<String>> permissionMap = Map.of(
                "ContractTrade", List.of("Order", "Position"),
                "Spot", List.of("SpotTrade"),
                "Wallet", List.of("AccountTransfer"),
                "Options", List.of("OptionsTrade"),
                "Derivatives", List.of("DerivativesTrade"),
                "Exchange", List.of("ExchangeHistory"),
                "CopyTrading", List.of("CopyTrading"),
                "BlockTrade", List.of("BlockTrade"),
                "NFT", List.of("NFTQueryProductList")
        );
        var subApiKeyRequest = UserDataRequest.builder().subuid(101472011)
                .readOnlyStatus(ReadOnlyStatus.READ_AND_WRITE)
                .permissionsMap(permissionMap)
                .ips(List.of("*"))
                .note("note test 20240911-map")
                .build();
        var subUser = client.createSubAPI(subApiKeyRequest);
        System.out.println(subUser);
    }
}
