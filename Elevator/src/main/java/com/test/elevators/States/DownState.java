package com.test.elevators.state;

import com.test.elevators.Elevator;

public class DownState extends ElevatorState {

    public DownState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up()  {
        throw new IllegalArgumentException("The elevator can not switch it's heading while going up");
    }

    @Override
    public void down() {
        throw new IllegalArgumentException("The elevator can not switch it's heading while going down");
    }

    @Override
    public void stop() {
        elevator.setElevatorState(new StopState(elevator));
    }

    @Override
    public void rest() {
        elevator.setElevatorState(new RestState(elevator));
    }

    @Override
    public int distanceFromFloor(int floor) {
        if (floor <= elevator.getCurrentFloor())
            return elevator.getCurrentFloor() - floor;
        else
            return floor + elevator.getNumberOfFloors() - elevator.getCurrentFloor();

    }
}
