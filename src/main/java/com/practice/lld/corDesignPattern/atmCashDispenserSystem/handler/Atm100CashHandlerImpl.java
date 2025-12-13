package com.practice.lld.corDesignPattern.atmCashDispenserSystem.handler;

public class Atm100CashHandlerImpl extends AtmCashHandler {
    @Override
    public void dispenseCash(Integer amount, AtmCashHandler handler) {
        System.out.println(getHandlerType());
        if (handler != null && amount > 0) {
            int units100 = amount / 100;
            System.out.println("units of 100 dispensed = " + units100);
            Integer remAmt = amount % 100;
            handler.setNextHandler(null);
            if (handler.getNextHandler() == null && remAmt!=0) {
                System.out.println("we dont have ");
            }
            else if (handler.getNextHandler() == null) {
                System.out.println("amnt processed successfully...");
            }
            else {
                handler.getNextHandler().dispenseCash(remAmt, handler);
            }

        }
        else {
            System.out.println("amnt processed successfully...");
        }
    }

    @Override
    public String getHandlerType() {
        return "100";
    }
}
