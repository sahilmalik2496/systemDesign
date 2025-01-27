package machineCoding.elevatorSystem;

import java.util.PriorityQueue;

class Elevator {
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;
    private Door door;
    private PriorityQueue<Integer> requestsQueue;

    public Elevator() {
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
        this.state = ElevatorState.IDLE;
        this.door = new Door();
        this.requestsQueue = new PriorityQueue<>();
    }

    public void addRequest(int floor) {
        requestsQueue.offer(floor);
        System.out.println("Request for floor " + floor + " added.");
    }

    public void move() {
        while (!requestsQueue.isEmpty()) {
            int targetFloor = requestsQueue.poll();
            System.out.println("Moving to floor " + targetFloor);
            while (currentFloor != targetFloor) {
                if (currentFloor < targetFloor) {
                    direction = Direction.UP;
                    currentFloor++;
                } else {
                    direction = Direction.DOWN;
                    currentFloor--;
                }
                System.out.println("Current floor: " + currentFloor);
            }
            direction = Direction.IDLE;
            state = ElevatorState.STOPPED;
            door.open();
            try {
                Thread.sleep(2000); // Simulate door open duration
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            door.close();
            state = ElevatorState.IDLE;
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }
}
