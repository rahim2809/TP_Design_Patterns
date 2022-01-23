package com.test.elevators.state;

import com.test.elevators.Elevator;

public class UpState extends ElevatorState {

    public UpState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up() {
        throw new IllegalArgumentException("The elevator is going up!");
    }

    @Override
    public void down() {
        throw new IllegalArgumentException("The elevator is going up!");
    }

    @Override
    public void stop() {
        elevator.setState(new StopState(elevator));
    }

    @Override
    public void rest() {
        elevator.setState(new RestState(elevator));
    }

    @Override
    public int distanceFromFloor(int floor) {
        if (floor >= elevator.getCurrentFloor())
            return floor - elevator.getCurrentFloor();
        else
            return floor + elevator.getNumberOfFloors() - elevator.getCurrentFloor();
    }
}
