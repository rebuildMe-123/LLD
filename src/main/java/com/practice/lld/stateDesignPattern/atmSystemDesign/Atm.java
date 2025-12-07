package com.practice.lld.stateDesignPattern.atmSystemDesign;

import lombok.Data;

@Data
public class Atm {
    private Integer balance;
    private AtmStateInterface currentAtmState;

    public Atm(Integer amount) {
        this.balance = amount;
        currentAtmState = new AtmIdleState(this);
    }

    public void insertCard() {
        currentAtmState.insertCard();
    }

    public void enterPin() {
        currentAtmState.enterPin();
    }

    public void ejectCard() {
        currentAtmState.ejectCard();
    }

    public void withdrawCash(Integer amount) {
        currentAtmState.withdrawCash(amount);
    }

}
