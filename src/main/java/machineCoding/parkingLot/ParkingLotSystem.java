package machineCoding.parkingLot;

public class ParkingLotSystem {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        // Add parking spaces
        lot.addParkingSpace(new ParkingSpace("S1", VehicleType.CAR, 1));
        lot.addParkingSpace(new ParkingSpace("S2", VehicleType.BIKE, 1));
        lot.addParkingSpace(new ParkingSpace("S3", VehicleType.TRUCK, 2));

        // Park a vehicle
        Vehicle car = new Vehicle("CAR123", VehicleType.CAR);
        Ticket ticket = lot.parkVehicle(car);
        System.out.println("Parked: " + ticket);

        // Unpark the vehicle
        double fee = lot.unparkVehicle(ticket.toString());
        System.out.println("Fee: " + fee);
    }
}
