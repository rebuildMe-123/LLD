package com.practice.lld.stateDesignPattern.trafficSignalSystem;

public class RedSignalState implements SignalState {

    @Override
    public void changeState(TrafficSignal signal) {
        System.out.println("Process Red Signal State... Moving to green state");
        signal.setState(new GreenSignalState());

    }

    @Override
    public String getStateType() {
        return "Red state in place";
    }
}
