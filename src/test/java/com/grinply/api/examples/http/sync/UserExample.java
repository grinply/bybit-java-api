package com.grinply.api.examples.http.sync;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.user.*;
import com.grinply.api.client.service.BybitApiClientFactory;

import java.util.List;
import java.util.Map;
public class UserExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newUserRestClient();

        // create a new sub user
        var subUserRequest = UserDataRequest.builder().username("VictorWuTest3")
                .password("Password123")
                .memberType(MemberType.NORMAL_SUB_ACCOUNT)
                .note("Some note")
                .switchOption(SwitchOption.TURN_OFF)
                .isUta(IsUta.CLASSIC_ACCOUNT)
                .build();
        var subUser = client.createSubMember(subUserRequest);
        System.out.println(subUser);

        // Get API Key Information
        var apikeyInfo = client.getCurrentAPIKeyInfo();
        System.out.println(apikeyInfo);

        // Get sub UID list
        var subUidsInfo = client.getSubUIDList();
        System.out.println(subUidsInfo);

        // Create a new api key
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
        UserDataRequest createApiKeyRequest = UserDataRequest.builder().subuid(1637192).readOnlyStatus(ReadOnlyStatus.READ_AND_WRITE).userPermissionsMap(permissions)
                .ips(List.of("*"))
                .note("Some note")
                .build();
        var subAPIKey = client.createSubAPI(createApiKeyRequest);
        System.out.println(subAPIKey);

        // freeze a sub uid
        UserDataRequest freezeSubUIDRequest = UserDataRequest.builder().subuid(1553904).frozenStatus(FrozenStatus.UNFREEZE).build();
        var freezeResponse = client.freezeSubMember(freezeSubUIDRequest);
        System.out.println(freezeResponse);

        // get UID wallet type
        UserDataRequest uidWallet = UserDataRequest.builder().build();
        var uidWalletType = client.getUIDWalletType(uidWallet);
        System.out.println(uidWalletType);

        // get affiliate User info
        UserDataRequest affiliateRequest = UserDataRequest.builder().uid("1553904").build();
        var affiliateInfo = client.getAffiliateUserInfo(affiliateRequest);
        System.out.println(affiliateInfo);
    }
}
