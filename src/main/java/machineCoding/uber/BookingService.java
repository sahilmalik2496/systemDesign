package machineCoding.uber;

import java.util.List;

class BookingService {
    private final User user;
    private List<Driver> availableDrivers;

    public BookingService(User user) {
        this.user = user;
    }

    public Ride bookRide(Rider rider, Location source, Location destination) {
        Driver driver = findNearestDriver(source);
        if (driver != null) {
            Ride ride = new Ride();
            return ride;
        } else {
            throw new RuntimeException("No drivers available!");
        }
    }


    private Driver findNearestDriver(Location source) {
        // Find the nearest available driver based on location
        return null;
    }

    private double calculateFare(Location source, Location destination) {
        double distance = source.calculateDistance(destination);
        return distance * 10; // Base rate per km
    }
}
