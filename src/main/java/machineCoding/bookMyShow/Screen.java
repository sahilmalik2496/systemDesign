package machineCoding.bookMyShow;

import java.util.List;

class Screen {
    private String screenId;
    private int totalSeats;
    private List<Show> shows;

    public Screen(String screenId, int totalSeats) {
        this.screenId = screenId;
        this.totalSeats = totalSeats;
    }

    // Getters and Setters
    public String getScreenId() {
        return screenId;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void addShow(Show show) {
        shows.add(show);
    }
}
