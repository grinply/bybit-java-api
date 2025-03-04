package com.grinply.api.client.domain.preupgrade;

import lombok.Getter;

@Getter
public enum TransactionType {
    TRANSFER_IN("TRANSFER_IN"),
    TRANSFER_OUT("TRANSFER_OUT"),
    TRADE("TRADE"),
    SETTLEMENT("SETTLEMENT"),
    DELIVERY("DELIVERY"),
    LIQUIDATION("LIQUIDATION"),
    BONUS("BONUS"),
    FEE_REFUND("FEE_REFUND"),
    INTEREST("INTEREST"),
    CURRENCY_BUY("CURRENCY_BUY"),
    CURRENCY_SELL("CURRENCY_SELL"),
    BORROWED_AMOUNT_INS_LOAN("BORROWED_AMOUNT_INS_LOAN"),
    PRINCIPLE_REPAYMENT_INS_LOAN("PRINCIPLE_REPAYMENT_INS_LOAN"),
    INTEREST_REPAYMENT_INS_LOAN("INTEREST_REPAYMENT_INS_LOAN"),
    AUTO_SOLD_COLLATERAL_INS_LOAN("AUTO_SOLD_COLLATERAL_INS_LOAN"),
    AUTO_BUY_LIABILITY_INS_LOAN("AUTO_BUY_LIABILITY_INS_LOAN"),
    AUTO_PRINCIPLE_REPAYMENT_INS_LOAN("AUTO_PRINCIPLE_REPAYMENT_INS_LOAN"),
    AUTO_INTEREST_REPAYMENT_INS_LOAN("AUTO_INTEREST_REPAYMENT_INS_LOAN");

    private final String transactionTypeId;

    TransactionType(String transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

}

