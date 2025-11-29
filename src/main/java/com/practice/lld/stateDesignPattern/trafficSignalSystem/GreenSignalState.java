package com.practice.lld.stateDesignPattern.trafficSignalSystem;

public class GreenSignalState implements SignalState {
    @Override
    public void changeState(TrafficSignal signal) {
        System.out.println("Processing green signal... Moving to yellow again...");
        signal.setState(new YellowSignalState());
    }

    @Override
    public String getStateType() {
        return "Green state in place";
    }
}
