package com.practice.lld.stateDesignPattern.atmSystemDesign;

public interface AtmStateInterface {

    void enterPin();
    void insertCard();
    void withdrawCash(Integer amount);
    void ejectCard();
}
