package com.practice.lld.corDesignPattern.atmCashDispenserSystem.handler;

public abstract class AtmCashHandler {
    private AtmCashHandler nextHandler;
    public void setNextHandler(AtmCashHandler handler) {
        this.nextHandler = handler;
    }

    public AtmCashHandler getNextHandler() {
        return this.nextHandler;
    }

    public abstract void dispenseCash(Integer amount, AtmCashHandler handler);

    public abstract String getHandlerType();




}
