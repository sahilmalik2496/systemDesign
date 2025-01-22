package machineCoding.airlineManagement;

class Ticket {
    private String ticketId;
    private Flight flight;
    private Passenger passenger;
    private String seatNumber;

    public Ticket(String ticketId, Flight flight, Passenger passenger, String seatNumber) {
        this.ticketId = ticketId;
        this.flight = flight;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", flight=" + flight +
                ", passenger=" + passenger +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
