package machineCoding.parkingLot;

// Concrete Implementations of ParkingSpot
public class TwoWheelerSpot implements ParkingSpot {
    private String spotId;
    private boolean available = true;

    public TwoWheelerSpot(String spotId) {
        this.spotId = spotId;
    }

    public String getSpotId() {
        return spotId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assign() {
        available = false;
    }

    public void release() {
        available = true;
    }
}
