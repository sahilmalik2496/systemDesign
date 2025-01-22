package machineCoding.hotelManagement;

import java.time.LocalDate;
import java.util.UUID;

class Guest {
    private String guestId;
    private String name;
    private String phone;
    private String email;
    private int loyaltyPoints;

    public Guest(String guestId, String name, String phone, String email) {
        this.guestId = guestId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.loyaltyPoints = 0;
    }

    public Booking makeBooking(Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        if (room.isAvailable()) {
            return new Booking(UUID.randomUUID().toString(), this, room, checkInDate, checkOutDate);
        } else {
            throw new IllegalStateException("Room is not available");
        }
    }

    public String getName() {
        return name;
    }
}

