package machineCoding.bookMyShow;

import java.util.ArrayList;
import java.util.List;

class TicketBookingSystem {
    private List<Cinema> cinemas;

    public TicketBookingSystem() {
        cinemas = new ArrayList<>();
    }

    // Get available movies
    public List<Movie> getAvailableMovies() {
        // Retrieve list of movies
        return null;
    }

    // Book a ticket for a show
    public Booking bookTicket(User user, Show show, List<Seat> seats) {
        // Check availability of seats
        // If available, create booking and charge payment
        Booking booking = new Booking("B" + System.currentTimeMillis(), user, show);
        for (Seat seat : seats) {
            seat.bookSeat();
            booking.addBookedSeat(seat);
        }
        return booking;
    }

    // Cancel a ticket
    public boolean cancelTicket(Booking booking) {
        // Refund payment
        for (Seat seat : booking.getBookedSeats()) {
            seat.cancelSeat();
        }
        return true;
    }
}
