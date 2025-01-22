package machineCoding.airlineManagement;

import java.util.HashMap;
import java.util.Map;

class Airline {
    private String name;
    private Map<String, Flight> flights;

    public Airline(String name) {
        this.name = name;
        this.flights = new HashMap<>();
    }

    public void addFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
    }

    public Flight getFlight(String flightNumber) {
        return flights.get(flightNumber);
    }

    public void displayFlights() {
        for (Flight flight : flights.values()) {
            System.out.println(flight);
        }
    }
}
