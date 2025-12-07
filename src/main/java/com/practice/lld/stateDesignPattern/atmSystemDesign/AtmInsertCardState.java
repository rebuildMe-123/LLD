package com.practice.lld.stateDesignPattern.atmSystemDesign;

public class AtmInsertCardState implements AtmStateInterface {

    private Atm atm;
    public AtmInsertCardState(Atm atm) {
         this.atm = atm;
    }

    @Override
    public void enterPin() {
        System.out.println("entered pin, pin looks gud..");
        // auth check for card
        atm.setCurrentAtmState(new AtmEnterPinState(atm));
    }

    @Override
    public void insertCard() {
        System.out.println("card already there...");
    }

    @Override
    public void withdrawCash(Integer amount) {
        System.out.println("provide pin first..");
    }

    @Override
    public void ejectCard() {
        System.out.println("card ejected...");
        atm.setCurrentAtmState(new AtmIdleState(atm));
    }
}
