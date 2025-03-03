package com.grinply.api.examples.http.sync;

import com.grinply.api.client.config.BybitApiConfig;
import com.grinply.api.client.domain.account.request.AccountDataRequest;
import com.grinply.api.client.domain.account.AccountType;
import com.grinply.api.client.service.BybitApiClientFactory;

public class AccountExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newAccountRestClient();

        // Get wallet balance
        var walletBalanceRequest = AccountDataRequest.builder().accountType(AccountType.UNIFIED).build();
        var walletBalanceData = client.getWalletBalance(walletBalanceRequest);
        System.out.println(walletBalanceData);

        // Upgrade to uta
        var upgradeToUTAResult = client.upgradeAccountToUTA();
        System.out.println(upgradeToUTAResult);

        // Get Borrow History
        var accountBorrowHistoryRequest = AccountDataRequest.builder().build();
        var accountBorrowData = client.getAccountBorrowHistory(accountBorrowHistoryRequest);
        System.out.println(accountBorrowData);

        // Get Account info
        var accountInfo = client.getAccountInfo();
        System.out.println(accountInfo);

        // Get Coin Geek
        var coinGeekRequest = AccountDataRequest.builder().baseCoin("BTC").build();
        var coinGeeks = client.getAccountCoinGeeks(coinGeekRequest);
        System.out.println(coinGeeks);

        // Get Transaction Log
        var transactionLogRequest = AccountDataRequest.builder().build();
        var transactionLogData = client.getTransactionLog(transactionLogRequest);
        System.out.println(transactionLogData);

    }
}
