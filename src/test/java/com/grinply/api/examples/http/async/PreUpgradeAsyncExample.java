package com.grinply.api.examples.http.async;

import com.grinply.api.client.domain.CategoryType;
import com.grinply.api.client.domain.preupgrade.PreUpgradeDataRequest;
import com.grinply.api.client.service.BybitApiClientFactory;

public class PreUpgradeAsyncExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET").newAsyncUserRestClient();

        // Get pre-upgrade order history
        var preupgradeOrderHistoryRequest = PreUpgradeDataRequest.builder().category(CategoryType.LINEAR).build();
        client.getPreUpgradeOrderHistory(preupgradeOrderHistoryRequest, System.out::println);

        // Get pre-upgrade trade history
        var preUpgradeTradeHistoryRequest = PreUpgradeDataRequest.builder().category(CategoryType.LINEAR).build();
        client.getPreUpgradeTradeHistory(preUpgradeTradeHistoryRequest, System.out::println);

        // Get pre-upgrade close pnl history
        var preupgradeClosePnlRequest = PreUpgradeDataRequest.builder().category(CategoryType.LINEAR).symbol("BTCUSDT").build();
        client.getPreUpgradeClosePnl(preupgradeClosePnlRequest, System.out::println);

        // Get pre-upgrade Transaction log
        var preUpgradeTransactionRequest = PreUpgradeDataRequest.builder().category(CategoryType.LINEAR).build();
        client.getPreUpgradeTransaction(preUpgradeTransactionRequest, System.out::println);


        // Get pre-upgrade option delivery
        var preUpgradeOptionDeliveryRequest = PreUpgradeDataRequest.builder().category(CategoryType.OPTION).build();
        client.getPreUpgradeOptionDelivery(preUpgradeOptionDeliveryRequest, System.out::println);

        // Get pre-upgrade usdc session settlement
        var preUpgradeUsdcSettlementRequest = PreUpgradeDataRequest.builder().category(CategoryType.LINEAR).build();
        client.getPreUpgradeUsdcSettlement(preUpgradeUsdcSettlementRequest, System.out::println);
    }
}
