package machineCoding.parkingLot;

// Parking Spot Interface
public interface ParkingSpot {
    String getSpotId();
    boolean isAvailable();
    void assign();
    void release();
}

