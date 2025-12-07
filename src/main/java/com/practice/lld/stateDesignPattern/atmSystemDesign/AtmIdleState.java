package com.practice.lld.stateDesignPattern.atmSystemDesign;

public class AtmIdleState implements AtmStateInterface {
    private Atm atm;

    public AtmIdleState(Atm atm) {
        this.atm= atm;
    }

    @Override
    public void enterPin() {
        System.out.println("card not inserted...");
    }

    @Override
    public void insertCard() {
        System.out.println("card inserted...");
        atm.setCurrentAtmState(new AtmInsertCardState(atm));
    }

    @Override
    public void withdrawCash(Integer amount) {
        System.out.println("card not inserted...");
    }

    @Override
    public void ejectCard() {
        System.out.println("card not inserted...");
    }
}
