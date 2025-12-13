package com.practice.lld.corDesignPattern.atmCashDispenserSystem;

import com.practice.lld.corDesignPattern.atmCashDispenserSystem.handler.Atm2kCashHandlerImpl;
import com.practice.lld.corDesignPattern.atmCashDispenserSystem.handler.AtmCashHandler;

public class AtmCashDispenserContext {

    private AtmCashHandler handler;
    private Integer amount;

    public AtmCashDispenserContext( Integer amount) {
        this.handler = new Atm2kCashHandlerImpl();
        this.amount = amount;
    }

    public void dispenseAmount(Integer amount) {
        handler.dispenseCash(amount, handler);
    }


}
