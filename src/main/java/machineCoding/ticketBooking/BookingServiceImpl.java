package machineCoding.ticketBooking;

import java.time.LocalDateTime;

public class BookingServiceImpl implements BookingService {
    private final ShowtimeRepository showtimeRepo;
    private final BookingRepository bookingRepo;

    public BookingServiceImpl(ShowtimeRepository showtimeRepo, BookingRepository bookingRepo) {
        this.showtimeRepo = showtimeRepo;
        this.bookingRepo = bookingRepo;
    }

    @Override
    public Booking bookTickets(int showtimeId, String customerName, int seats) {
        Showtime showtime = showtimeRepo.getShowtimeById(showtimeId);
        if (showtime == null) {
            throw new IllegalArgumentException("Invalid showtime ID");
        }

        double totalAmount = showtime.getPricePerTicket() * seats;

        // Create and save the booking
        Booking booking = new Booking();
        booking.setShowtimeId(showtimeId);
        booking.setCustomerName(customerName);
        booking.setSeatsBooked(seats);
        booking.setTotalAmount(totalAmount);
        booking.setBookingTime(LocalDateTime.now());

        bookingRepo.saveBooking(booking);
        return booking;
    }
}
