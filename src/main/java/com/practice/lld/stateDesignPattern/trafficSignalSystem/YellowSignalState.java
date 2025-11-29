package com.practice.lld.stateDesignPattern.trafficSignalSystem;

public class YellowSignalState implements SignalState{

    @Override
    public void changeState(TrafficSignal signal) {
        System.out.println("Processing yellow signal... Moving to red");
        signal.setState(new RedSignalState());
    }

    @Override
    public String getStateType() {
        return "Yellow state in place";
    }
}
