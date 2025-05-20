package machineCoding.parkingLot;

import java.util.HashMap;
import java.util.Map;

// Manager to handle Parking Spots
public class ParkingSpotManager {
    private Map<String, ParkingSpot> spots = new HashMap<>();

    public void addSpot(ParkingSpot spot) {
        spots.put(spot.getSpotId(), spot);
    }

    public ParkingSpot getAvailableSpot(VehicleType type) {
        for (ParkingSpot spot : spots.values()) {
            if (spot.isAvailable() &&
                    ((type == VehicleType.TWO_WHEELER && spot instanceof TwoWheelerSpot) ||
                            (type == VehicleType.FOUR_WHEELER && spot instanceof FourWheelerSpot))) {
                return spot;
            }
        }
        return null;
    }
}
