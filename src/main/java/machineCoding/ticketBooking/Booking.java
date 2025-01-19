package machineCoding.ticketBooking;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Booking {
    private int id;
    private int showtimeId;
    private String customerName;
    private int seatsBooked;
    private double totalAmount;
    private LocalDateTime bookingTime;
}
