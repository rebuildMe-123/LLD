package com.practice.lld.stateDesignPattern.trafficSignalSystem;

public interface SignalState {
    void changeState(TrafficSignal signal); // change the state of the traffic light

    String getStateType();
}
