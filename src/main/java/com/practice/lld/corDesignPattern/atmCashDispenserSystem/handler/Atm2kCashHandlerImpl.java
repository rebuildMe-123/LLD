package com.practice.lld.corDesignPattern.atmCashDispenserSystem.handler;

public class Atm2kCashHandlerImpl extends AtmCashHandler {
    @Override
    public void dispenseCash(Integer amount, AtmCashHandler handler) {
        /**
         *   amnt: 2800
         *   denominations: 2000, 500, 200, 100
         *
         *   int units = 2800/2000 => 1
         *   remaining = 2800 % 2000 = 800
         *
         */
        System.out.println(getHandlerType());
        if (amount > 0) {
            int units2K = amount / 2000;
            System.out.println("units of 2k dispensed = " + units2K);
            Integer remAmt = amount % 2000;
            handler.setNextHandler(new Atm500CashHandlerImpl());
            handler.getNextHandler().dispenseCash(remAmt, handler);
        }
        else {
            System.out.println("amnt processed successfully...");
        }

    }


    @Override
    public String getHandlerType() {
        return "2000";
    }
}
