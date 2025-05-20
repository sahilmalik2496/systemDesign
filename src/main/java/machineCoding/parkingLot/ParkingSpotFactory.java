package machineCoding.parkingLot;

// Factory Pattern for Parking Spot
public class ParkingSpotFactory {
    public static ParkingSpot createSpot(VehicleType type, String spotId) {
        switch (type) {
            case TWO_WHEELER:
                return new TwoWheelerSpot(spotId);
            case FOUR_WHEELER:
                return new FourWheelerSpot(spotId);
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
