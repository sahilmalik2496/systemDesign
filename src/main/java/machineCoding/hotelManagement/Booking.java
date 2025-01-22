package machineCoding.hotelManagement;

import java.time.LocalDate;

// Booking class
class Booking {
    private String bookingId;
    private Guest guest;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private BookingStatus status;

    public Booking(String bookingId, Guest guest, Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = BookingStatus.CONFIRMED;

        room.bookRoom();
    }

    public void cancelBooking() {
        if (status == BookingStatus.CONFIRMED) {
            status = BookingStatus.CANCELED;
            room.releaseRoom();
        } else {
            throw new IllegalStateException("Booking is already canceled");
        }
    }

    public String getBookingDetails() {
        return String.format("Booking ID: %s, Guest: %s, Room: %d, Status: %s",
                bookingId, guest.getName(), room.getRoomNumber(), status);
    }
}

