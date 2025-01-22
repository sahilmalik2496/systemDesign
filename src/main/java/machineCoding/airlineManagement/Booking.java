package machineCoding.airlineManagement;

import java.util.UUID;

class Booking {
    private final Flight flight;

    public Booking(Flight flight) {
        this.flight = flight;
    }

    public Ticket bookTicket(Flight flight, Passenger passenger) {
        if (flight.bookSeat()) {
            String ticketId = UUID.randomUUID().toString();
            String seatNumber = "S" + (flight.getTotalSeats() - flight.getAvailableSeats());
            return new Ticket(ticketId, flight, passenger, seatNumber);
        }
        return null; // Booking failed due to no available seats
    }

    public void cancelTicket(Flight flight, Ticket ticket) {
        flight.cancelSeat();
        System.out.println("Ticket cancelled: " + ticket);
    }
}
