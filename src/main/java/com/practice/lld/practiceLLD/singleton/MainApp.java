package com.practice.lld.practiceLLD.singleton;

public class MainApp {


    public static void main(String[] args) {
        System.out.println("App Started ....");

        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());

        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2.hashCode());



    }
}
