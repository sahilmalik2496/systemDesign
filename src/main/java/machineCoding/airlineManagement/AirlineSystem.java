package machineCoding.airlineManagement;

import java.time.LocalDateTime;

public class AirlineSystem {
    private final Flight flight;

    public AirlineSystem(Flight flight) {
        this.flight = flight;
    }

    public static void main(String[] args) {
        // Airline setup
        Airline airline = new Airline("Sky Airlines");

        Flight flight1 = new Flight("F101", "New York", "London",
                LocalDateTime.of(2025, 1, 23, 15, 30),
                LocalDateTime.of(2025, 1, 24, 5, 30),
                10);

        Flight flight2 = new Flight("F102", "Mumbai", "Dubai",
                LocalDateTime.of(2025, 1, 23, 18, 0),
                LocalDateTime.of(2025, 1, 23, 21, 0),
                5);

        airline.addFlight(flight1);
        airline.addFlight(flight2);

        // Passenger setup
        Passenger passenger1 = new Passenger("P001", "Alice", "1234567890", "alice@example.com");
        Passenger passenger2 = new Passenger("P002", "Bob", "9876543210", "bob@example.com");

        // Booking system
        Booking bookingSystem = new Booking();

        // Book tickets
        Ticket ticket1 = bookingSystem.bookTicket(flight1, passenger1);
        System.out.println("Booked Ticket: " + ticket1);

        Ticket ticket2 = bookingSystem.bookTicket(flight1, passenger2);
        System.out.println("Booked Ticket: " + ticket2);

        // Cancel a ticket
        bookingSystem.cancelTicket(flight1, ticket1);

        // Display flights
        airline.displayFlights();
    }
}
