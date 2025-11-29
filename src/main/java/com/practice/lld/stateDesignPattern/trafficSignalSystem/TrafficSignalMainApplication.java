package com.practice.lld.stateDesignPattern.trafficSignalSystem;

public class TrafficSignalMainApplication {

    public static void main(String[] args) {
        System.out.println("main app started");
        TrafficSignal signal = new TrafficSignal();

        System.out.println(signal.getState());
        signal.changeState();
        System.out.println(signal.getState());
        signal.changeState();
        System.out.println(signal.getState());
        signal.changeState();
        System.out.println(signal.getState());
    }
}
