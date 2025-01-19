package machineCoding.ticketBooking;

public class MovieTicketBookingApp {
    public static void main(String[] args) {
        // Initialize repositories
        ShowtimeRepository showtimeRepo = new ShowtimeRepository();
        BookingRepository bookingRepo = new BookingRepository();

        // Add dummy data
        Showtime showtime = new Showtime(1, "Avengers: Endgame", 10.0);
        showtimeRepo.addShowtime(showtime);

        // Initialize service
        BookingService bookingService = new BookingServiceImpl(showtimeRepo, bookingRepo);

        // Book tickets
        Booking booking = bookingService.bookTickets(1, "John Doe", 3);
        System.out.println("Booking successful! Booking ID: " + booking.getId());
    }
}
