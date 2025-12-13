package com.practice.lld.corDesignPattern.atmCashDispenserSystem;

public class AtmCashDispenserMainApplication {

    public static void main(String[] args) {
        System.out.println("Started Processing AtmCashDispenserMainApplication...");

//        int remaining = 2800 % 2000;
//        System.out.println(remaining);

        AtmCashDispenserContext context = new AtmCashDispenserContext(2800);
        context.dispenseAmount(2800);

    }
}
