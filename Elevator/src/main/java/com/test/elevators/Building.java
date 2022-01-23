package com.test.elevators;

import com.test.elevators.ElevatorCreation.ConcreteElevatorCreation;
import com.test.elevators.ElevatorCreation.ElevatorCreation;

import java.util.HashMap;
import java.util.Map;

public class Building {

    private int numberOfFloors;
    private HashMap<String, Elevator> elevators;
    private ElevatorCreation elevatorCreator = ConcreteElevatorCreation.getInstance();

    public Building(int numberOfFloors, String... elevators) {
        this.elevators = new HashMap<>();
        this.numberOfFloors = numberOfFloors;
        for (String identifiant : elevators) {
            Elevator elevator = elevatorCreator.createElevator(identifiant, numberOfFloors);
            this.elevators.put(elevator.getIdElevator(), elevator);
        }
    }

    public String requestElevator() {
        return requestElevator(this.numberOfFloors);
    }

    public String requestElevator(int requestedFloor) {
        //Let's find the elevator with the minimum distance between him and the top floor
        int min = Integer.MAX_VALUE;
        String nearestElevator = "";
        for (Map.Entry<String, Elevator> elevator : elevators.entrySet()) {
            //First of all we have to see what state the elevator is.
            //Logic
            if (elevator.getValue().getElevatorState().distanceFromFloor(requestedFloor) != -1
                    && elevator.getValue().getElevatorState().distanceFromFloor(requestedFloor) <= min) {
                min = elevator.getValue().getElevatorState().distanceFromFloor(requestedFloor);
                nearestElevator = elevator.getKey();
            }
        }
        return nearestElevator;
    }

    public void move(String identifiant, String action) {
        Elevator elevator = elevators.get(identifiant);
        elevator.getElevatorState().move(elevator, action);
    }

    public void stopAt(String identifiant, int floorNumber) {
        Elevator elevator = elevators.get(identifiant);
        elevator.setCurrentFloor(floorNumber);
        elevator.getElevatorState().stop();
    }

}
