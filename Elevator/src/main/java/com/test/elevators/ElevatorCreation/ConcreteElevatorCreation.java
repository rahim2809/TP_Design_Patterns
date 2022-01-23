package com.test.elevators.ElevatorCreation;

import com.test.elevators.Elevator;

public class ConcreteElevatorCreation extends ElevatorCreation {

    private static ConcreteElevatorCreation instance;

    // private constructor
    private ConcreteElevatorCreation() {
    }

    public static ConcreteElevatorCreation getInstance() {
        if (instance == null) {
            instance = new ConcreteElevatorCreation();
        }
        return instance;
    }

    @Override
    public Elevator createElevator(String identifiant, int numberOfFloors) {
        
        String id = identifiant.split(":")[0];
        int currentFloor = Integer.parseInt(identifiant.split(":")[0]);
        return new Elevator(id, numberOfFloors , currentFloor);
    }
}
