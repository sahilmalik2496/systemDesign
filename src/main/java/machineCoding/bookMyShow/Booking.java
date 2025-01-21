package machineCoding.bookMyShow;

import java.util.List;

class Booking {
    private String bookingId;
    private User user;
    private Show show;
    private List<Seat> bookedSeats;

    public Booking(String bookingId, User user, Show show) {
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
    }

    // Getters and Setters
    public String getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void addBookedSeat(Seat seat) {
        bookedSeats.add(seat);
    }
}
