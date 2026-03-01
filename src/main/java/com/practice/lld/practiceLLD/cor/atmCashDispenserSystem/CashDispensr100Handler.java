package com.practice.lld.practiceLLD.cor.atmCashDispenserSystem;

import java.util.Map;

public class CashDispensr100Handler extends CashDispenserHandler {



    public CashDispensr100Handler() {
        this.nextHandler = null;
    }


    @Override
    public boolean allowRequest(Integer amount, Map<Integer, Integer> cashDenominationsByCount) {
        if(amount == 0) {
            return true;
        }
        int maxCountPossible = amount/100;
        if (maxCountPossible > 0 && cashDenominationsByCount.get(100) > 0) {
            int countPossible = Math.min(cashDenominationsByCount.get(100), maxCountPossible);
            amount -= 100* countPossible;
            cashDenominationsByCount.put(100, cashDenominationsByCount.get(100)-countPossible);
            if(amount == 0) {
                System.out.println("Amount successfully processed at 100 handler");
                return true;
            }
            else {
                if (nextHandler == null) return false;
                System.out.println("100 Notes processed, left amount forwareded " + amount);
                return nextHandler.allowRequest(amount, cashDenominationsByCount);
            }
        }
        else {
            if (nextHandler == null) return false;
            System.out.println(" 100 Notes not proceses, left amount forwared " + amount);
            return nextHandler.allowRequest(amount, cashDenominationsByCount);
        }

    }
 }
