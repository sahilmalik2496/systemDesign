package machineCoding.parkingLot;

import java.util.Date;

class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private Date entryTime;
    private Date exitTime;
    private ParkingSpace parkingSpace;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSpace parkingSpace) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpace = parkingSpace;
        this.entryTime = new Date();
    }

    public void markExit() {
        this.exitTime = new Date();
    }

    public double calculateFee() {
        if (exitTime == null) {
            throw new IllegalStateException("Exit time not recorded.");
        }

        long duration = exitTime.getTime() - entryTime.getTime(); // in milliseconds
        long hours = Math.max(1, duration / (1000 * 60 * 60));
        switch (vehicle.getType()) {
            case CAR:
                return hours * 10.0;
            case BIKE:
                return hours * 5.0;
            case TRUCK:
                return hours * 20.0;
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }

    @Override
    public String toString() {
        return "Ticket{ticketId='" + ticketId + "', vehicle=" + vehicle + ", parkingSpace=" + parkingSpace + '}';
    }
}
