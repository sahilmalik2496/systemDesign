package machineCoding.ticketBooking;

public interface BookingService {
    Booking bookTickets(int showtimeId, String customerName, int seats);
}
