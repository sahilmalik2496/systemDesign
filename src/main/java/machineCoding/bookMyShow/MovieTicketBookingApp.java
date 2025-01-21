package machineCoding.bookMyShow;

import java.util.List;

public class MovieTicketBookingApp {
    private final Movie movie;

    public MovieTicketBookingApp(Movie movie) {
        this.movie = movie;
    }

    public static void main(String[] args) {
        // Create users, movies, cinemas, shows, and screens
        User user = new User("U1", "John Doe", "john@example.com", "123456789");
        Cinema cinema = new Cinema("C1", "Inox", "New York");
        Movie movie = new Movie("M1", "Inception", "Sci-Fi", 148);
        Screen screen = new Screen("S1", 100);
        Show show = new Show("SH1", movie.getMovieId(), "2025-01-21 10:00", "2025-01-21 12:30");

        // Add show to screen
        screen.addShow(show);

        // Book a ticket for the user
        TicketBookingSystem system = new TicketBookingSystem();
        List<Seat> seats = List.of(new Seat("A1"), new Seat("A2"));
        Booking booking = system.bookTicket(user, show, seats);

        // Process payment
        Payment payment = new Payment("P1", 500);
        payment.processPayment();

        // Display booking details
        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("User: " + booking.getUser().getName());
    }
}
