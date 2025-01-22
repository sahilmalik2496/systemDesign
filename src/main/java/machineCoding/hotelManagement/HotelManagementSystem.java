package machineCoding.hotelManagement;

import java.time.LocalDate;
import java.util.List;

public class HotelManagementSystem {
    public static void main(String[] args) {
        // Create a hotel
        Hotel hotel = new Hotel("Paradise Inn", "New York");

        // Add rooms
        hotel.addRoom(new Room(101, RoomType.SINGLE, 100));
        hotel.addRoom(new Room(102, RoomType.DOUBLE, 150));
        hotel.addRoom(new Room(103, RoomType.SUITE, 300));

        // Create a guest
        Guest guest = new Guest("G001", "John Doe", "1234567890", "john@example.com");

        // Search for available rooms
        List<Room> availableRooms = hotel.searchAvailableRooms(RoomType.DOUBLE);
        if (!availableRooms.isEmpty()) {
            Room selectedRoom = availableRooms.get(0);

            // Book a room
            Booking booking = guest.makeBooking(selectedRoom, LocalDate.now(), LocalDate.now().plusDays(3));
            System.out.println(booking.getBookingDetails());

            // Process payment
            Payment payment = new Payment(selectedRoom.getPrice(), PaymentMode.CREDIT_CARD);
            if (payment.isSuccess()) {
                System.out.println("Payment successful!");
            }
        } else {
            System.out.println("No rooms available");
        }
    }
}

