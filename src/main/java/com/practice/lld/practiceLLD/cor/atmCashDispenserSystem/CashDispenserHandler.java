package com.practice.lld.practiceLLD.cor.atmCashDispenserSystem;

import java.util.Map;

public abstract class CashDispenserHandler {
    protected CashDispenserHandler nextHandler;

    public void setNextHandler(CashDispenserHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean allowRequest(Integer amount, Map<Integer, Integer> cashDenominationsByCount);
}
