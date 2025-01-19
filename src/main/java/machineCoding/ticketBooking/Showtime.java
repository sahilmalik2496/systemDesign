package machineCoding.ticketBooking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Showtime {
    private int id;
    private int screenId;
    private int movieId;
    private String movieTitle; // Optional: If needed for easier access
    private String showDate;
    private String showTime;
    private double pricePerTicket;

    public Showtime(int i, String s, double v) {
    }
}