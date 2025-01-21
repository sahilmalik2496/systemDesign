package machineCoding.bookMyShow;

import java.util.List;

class Show {
    private String showId;
    private String movieId;
    private String startTime;
    private String endTime;
    private List<Seat> availableSeats;

    public Show(String showId, String movieId, String startTime, String endTime) {
        this.showId = showId;
        this.movieId = movieId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters
    public String getShowId() {
        return showId;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }

    public void addAvailableSeat(Seat seat) {
        availableSeats.add(seat);
    }
}
