package machineCoding.parkingLot;

class Vehicle {
    private String licensePlate;
    private VehicleType type;

    public Vehicle(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle{licensePlate='" + licensePlate + "', type=" + type + '}';
    }
}
