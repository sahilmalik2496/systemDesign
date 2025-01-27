package machineCoding.elevatorSystem;

import java.util.ArrayList;
import java.util.List;

class ElevatorController {
    private List<Elevator> elevators;

    public ElevatorController(int numberOfElevators) {
        elevators = new ArrayList<>();
        for (int i = 0; i < numberOfElevators; i++) {
            elevators.add(new Elevator());
        }
    }

    public void requestElevator(int floor, Direction direction) {
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {
            int distance = Math.abs(elevator.getCurrentFloor() - floor);
            if (distance < minDistance) {
                minDistance = distance;
                bestElevator = elevator;
            }
        }

        if (bestElevator != null) {
            bestElevator.addRequest(floor);
        }
    }

    public void runElevators() {
        for (Elevator elevator : elevators) {
            new Thread(elevator::move).start();
        }
    }
}
