package machineCoding.parkingLot;

class ParkingSpace {
    private String id;
    private VehicleType size;
    private boolean isAvailable;
    private int floor;

    public ParkingSpace(String id, VehicleType size, int floor) {
        this.id = id;
        this.size = size;
        this.isAvailable = true;
        this.floor = floor;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void markAvailable() {
        this.isAvailable = true;
    }

    public void markUnavailable() {
        this.isAvailable = false;
    }

    public VehicleType getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ParkingSpace{id='" + id + "', size=" + size + ", floor=" + floor + '}';
    }
}

