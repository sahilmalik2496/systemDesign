package machineCoding.elevatorSystem;

class FloorRequest {
    private int floorNumber;
    private Direction direction;

    public FloorRequest(int floorNumber, Direction direction) {
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Direction getDirection() {
        return direction;
    }
}

