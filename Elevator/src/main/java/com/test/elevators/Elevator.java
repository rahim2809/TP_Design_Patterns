package com.test.elevators;

import com.test.elevators.state.ElevatorState;
import com.test.elevators.state.RestState;

public class Elevator {

    private int numberOfFloors;
    private String id;
    private int currentFloor;

    //TODO: Add elevator state
    private ElevatorState elevatorState;

    public Elevator(int numberOfFloors, String id, int currentFloor) {
        this.elevatorState = new RestState(this);
        this.numberOfFloors = numberOfFloors;
        this.id = id;
        this.currentFloor = currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }
}
