package com.test.elevators.state;

import com.test.elevators.Elevator;

public class RestState extends ElevatorState {

    public RestState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up() {
        elevator.setState(new UpState(elevator));
    }

    @Override
    public void down() {
        elevator.setState(new DownState(elevator));
    }

    @Override
    public void stop() {
        elevator.setState(new StopState(elevator));
    }

    @Override
    public void rest() {
        throw new IllegalArgumentException("The elevator is resting...");

    }

    @Override
    public int distanceFromFloor(int floor) {
        return Math.abs(floor - elevator.getCurrentFloor());
    }
}
