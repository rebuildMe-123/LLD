package com.practice.lld.practiceLLD.cor.atmCashDispenserSystem;

import java.util.HashMap;
import java.util.Map;

public class AtmCashDispenserService {
    private CashDispenserHandler cashDispenserHandler;
    Map<Integer, Integer> cashDenominationsByCount = new HashMap<>();

    public AtmCashDispenserService() {
        // populate the cash m/c
        cashDenominationsByCount.put(100, 5);
        cashDenominationsByCount.put(500, 2);
        cashDenominationsByCount.put(1000, 2);
    }

    public boolean allowRequest(Integer amount) {
        cashDispenserHandler = new CashDispenser1000Handler();
        return cashDispenserHandler.allowRequest(amount, cashDenominationsByCount);

    }

}
