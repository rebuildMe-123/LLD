package com.practice.lld.practiceLLD.cor.atmCashDispenserSystem;

import java.util.Map;

public class CashDispensr500Handler extends CashDispenserHandler {

    public CashDispensr500Handler() {
        this.nextHandler = new CashDispensr100Handler();
    }


    @Override
    public boolean allowRequest(Integer amount, Map<Integer, Integer> cashDenominationsByCount) {
        if(amount == 0) {
            return true;
        }
        int maxCountPossible = amount/500;
        if (maxCountPossible > 0 && cashDenominationsByCount.get(500) > 0) {
            int countPossible = Math.min(cashDenominationsByCount.get(500), maxCountPossible);
            amount -= 500* countPossible;
            cashDenominationsByCount.put(500, cashDenominationsByCount.get(500)-countPossible);
            if(amount == 0) {
                System.out.println("Amount successfully processed at 500 handler");
                return true;
            }
            else {
                if (nextHandler == null) return false;
                System.out.println("500 Notes processed, left amount forwareded " + amount);
                return nextHandler.allowRequest(amount, cashDenominationsByCount);
            }
        }
        else {
            if (nextHandler == null) return false;
            System.out.println("500 Notes not proceses, left amount forwared " + amount);
            return nextHandler.allowRequest(amount, cashDenominationsByCount);
        }

    }
}
