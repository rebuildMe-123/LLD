package com.practice.lld.stateDesignPattern.atmSystemDesign;

public class AtmEnterPinState implements AtmStateInterface{
    private Atm atm;

    public AtmEnterPinState(Atm atm) {
        this.atm = atm;
    }
    @Override
    public void enterPin() {
        System.out.println("pin entered already");
    }

    @Override
    public void insertCard() {
        System.out.println("card present already");
    }

    @Override
    public void withdrawCash(Integer amount) {
        if (atm.getBalance() >= amount) {
            System.out.println("started processing cash...");
            atm.setBalance(atm.getBalance()-amount);
            System.out.println("Success");
            atm.setCurrentAtmState(new AtmIdleState(atm));
        }
        else {
            System.out.println("Insufficient fund");
        }
    }

    @Override
    public void ejectCard() {
        System.out.println("pin entered already");
        atm.setCurrentAtmState(new AtmIdleState(atm));
    }
}
