package com.practice.lld.stateDesignPattern.atmSystemDesign;

public class AtmSystemMainApplication {
    public static void main(String[] args) {
        System.out.println("Processing Atm System ...");
        Atm atm = new Atm(5000);
        System.out.println("Current balance: "+ atm.getBalance());
        atm.insertCard();
        atm.enterPin();
        atm.withdrawCash(500);
        atm.ejectCard();
        System.out.println("Current balance: "+ atm.getBalance());

    }
}
