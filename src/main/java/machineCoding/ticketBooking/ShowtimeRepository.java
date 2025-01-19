package machineCoding.ticketBooking;

import java.util.HashMap;
import java.util.Map;

public class ShowtimeRepository {
    private final Map<Integer, Showtime> showtimes = new HashMap<>();

    public Showtime getShowtimeById(int id) {
        return showtimes.get(id);
    }

    public void addShowtime(Showtime showtime) {
        showtimes.put(showtime.getId(), showtime);
    }
}