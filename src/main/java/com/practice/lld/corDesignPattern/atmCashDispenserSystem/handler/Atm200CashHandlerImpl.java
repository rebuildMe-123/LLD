package com.practice.lld.corDesignPattern.atmCashDispenserSystem.handler;

public class Atm200CashHandlerImpl extends AtmCashHandler{
    @Override
    public void dispenseCash(Integer amount, AtmCashHandler handler) {
        System.out.println(getHandlerType());
        if (amount > 0) {
            int units200 = amount / 200;
            System.out.println("units of 200 dispensed = " + units200);
            Integer remAmt = amount % 200;
            handler.setNextHandler(new Atm100CashHandlerImpl());
            handler.getNextHandler().dispenseCash(remAmt, handler);
        }
        else {
            System.out.println("amnt processed successfully...");
        }

    }

    @Override
    public String getHandlerType() {
        return "200";
    }
}
