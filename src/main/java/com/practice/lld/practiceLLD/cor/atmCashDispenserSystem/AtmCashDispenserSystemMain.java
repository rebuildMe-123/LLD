package com.practice.lld.practiceLLD.cor.atmCashDispenserSystem;

import java.util.Scanner;

public class AtmCashDispenserSystemMain {
    public static void main(String[] args) {
        System.out.println("Atm cash Dispenser service is running ...");

        AtmCashDispenserService service = new AtmCashDispenserService();
        System.out.println("start printing cash Denomominations by count");
        System.out.println(service.cashDenominationsByCount);
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println("start processing the amount = "+ amount);
        System.out.println(service.allowRequest(amount));
        System.out.println(service.cashDenominationsByCount);
    }
}
