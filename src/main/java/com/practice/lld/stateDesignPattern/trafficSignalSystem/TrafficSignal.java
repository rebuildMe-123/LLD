package com.practice.lld.stateDesignPattern.trafficSignalSystem;

public class TrafficSignal {
    private SignalState currentState; // has a relation with signal state i.e contain signal state

    // Initialize TrafficSignal object with red state only
    public TrafficSignal () {
        this.currentState = new RedSignalState();
    }

    public void setState(SignalState state) {
        this.currentState = state;
    }

    public void changeState() {
        System.out.println("Updating the state...");
        this.currentState.changeState(this);

    }

    public String getState() {
        return this.currentState.getStateType();
    }




}
