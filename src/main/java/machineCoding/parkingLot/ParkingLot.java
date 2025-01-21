package machineCoding.parkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class ParkingLot {
    private Map<String, ParkingSpace> spaces;
    private Map<String, Ticket> activeTickets;

    public ParkingLot() {
        this.spaces = new HashMap<>();
        this.activeTickets = new HashMap<>();
    }

    public void addParkingSpace(ParkingSpace space) {
        spaces.put(space.toString(), space);
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingSpace space : spaces.values()) {
            if (space.isAvailable() && space.getSize() == vehicle.getType()) {
                space.markUnavailable();
                Ticket ticket = new Ticket(UUID.randomUUID().toString(), vehicle, space);
                activeTickets.put(ticket.toString(), ticket);
                return ticket;
            }
        }
        throw new IllegalStateException("No available spaces for vehicle type: " + vehicle.getType());
    }

    public double unparkVehicle(String ticketId) {
        if (!activeTickets.containsKey(ticketId)) {
            throw new IllegalArgumentException("Invalid ticket ID.");
        }

        Ticket ticket = activeTickets.get(ticketId);
        ticket.markExit();
        ticket.parkingSpace.markAvailable();
        activeTickets.remove(ticketId);
        return ticket.calculateFee();
    }
}
