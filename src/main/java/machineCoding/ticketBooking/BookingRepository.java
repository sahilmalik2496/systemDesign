package machineCoding.ticketBooking;


import java.util.HashMap;
import java.util.Map;

public class BookingRepository {
    private final Map<Integer, Booking> bookings = new HashMap<>();
    private int bookingCounter = 1;

    public void saveBooking(Booking booking) {
        booking.setId(bookingCounter++);
        bookings.put(booking.getId(), booking);
    }

    public Booking getBookingById(int id) {
        return bookings.get(id);
    }
}

