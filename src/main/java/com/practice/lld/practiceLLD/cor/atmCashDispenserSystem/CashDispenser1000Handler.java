package com.practice.lld.practiceLLD.cor.atmCashDispenserSystem;

import java.util.Map;

public class CashDispenser1000Handler extends CashDispenserHandler {


    public CashDispenser1000Handler() {
        this.nextHandler = new CashDispensr500Handler();
    }


    @Override
    public boolean allowRequest(Integer amount, Map<Integer, Integer> cashDenominationsByCount) {
        if(amount == 0) {
            return true;
        }
           int maxCountPossible = amount/1000;
           if (maxCountPossible > 0 && cashDenominationsByCount.get(1000) > 0) {
               int countPossible = Math.min(cashDenominationsByCount.get(1000), maxCountPossible);
               amount -= 1000* countPossible;
               cashDenominationsByCount.put(1000, cashDenominationsByCount.get(1000)-countPossible);
               if(amount == 0) {
                   System.out.println("Amount successfully processed at 1000 handler");
                   return true;
               }
               else {
                   if (nextHandler == null) return false;
                   System.out.println("1k Notes processed, left amount forwareded " + amount);
                   return nextHandler.allowRequest(amount, cashDenominationsByCount);
               }
           }
           else {
               if (nextHandler == null) return false;
               System.out.println(" 1k Notes not proceses, left amount forwared " + amount);
               return nextHandler.allowRequest(amount, cashDenominationsByCount);
           }

    }
}
