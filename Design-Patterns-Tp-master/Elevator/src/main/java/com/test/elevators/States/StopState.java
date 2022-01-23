package com.test.elevators.state;

import com.test.elevators.Elevator;

public class StopState extends ElevatorState {

    public StopState(Elevator elevator) {
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
        throw new IllegalArgumentException("elevator previously stopped");
    }

    @Override
    public void rest() {
        elevator.setState(new RestState(elevator));
    }

    @Override
    public int distanceFromFloor(int floor) {
        return -1;
    }
}
