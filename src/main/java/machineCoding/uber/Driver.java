package machineCoding.uber;

class Driver extends User {
    private Vehicle vehicle;
    private boolean isAvailable;
    private double rating;

    public void updateLocation(Location location);

    public void acceptRide(Ride ride);
}
