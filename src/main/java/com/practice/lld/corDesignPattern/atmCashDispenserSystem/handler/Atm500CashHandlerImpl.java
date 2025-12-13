package com.practice.lld.corDesignPattern.atmCashDispenserSystem.handler;

public class Atm500CashHandlerImpl extends AtmCashHandler {
    @Override
    public void dispenseCash(Integer amount, AtmCashHandler handler) {

        System.out.println(getHandlerType());
        if (amount > 0) {
            int units500 = amount / 500;
            System.out.println("units of 500 dispensed = " + units500);
            Integer remAmt = amount % 500;
            handler.setNextHandler(new Atm200CashHandlerImpl());
            handler.getNextHandler().dispenseCash(remAmt, handler);
        }
        else {
            System.out.println("amnt processed successfully...");
        }

    }

    @Override
    public String getHandlerType() {
        return "500";
    }
}
