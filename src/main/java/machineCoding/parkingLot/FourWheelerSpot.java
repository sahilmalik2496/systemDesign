package machineCoding.parkingLot;

public class FourWheelerSpot implements ParkingSpot {
    private String spotId;
    private boolean available = true;

    public FourWheelerSpot(String spotId) {
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
