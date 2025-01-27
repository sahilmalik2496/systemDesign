package machineCoding.elevatorSystem;

class Door {
    private DoorState doorState;

    public Door() {
        this.doorState = DoorState.CLOSED;
    }

    public void open() {
        doorState = DoorState.OPEN;
        System.out.println("Doors are open.");
    }

    public void close() {
        doorState = DoorState.CLOSED;
        System.out.println("Doors are closed.");
    }

    public DoorState getDoorState() {
        return doorState;
    }
}
