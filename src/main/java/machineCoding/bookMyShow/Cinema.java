package machineCoding.bookMyShow;

import java.util.List;

class Cinema {
    private String cinemaId;
    private String name;
    private String location;
    private List<Screen> screens;

    public Cinema(String cinemaId, String name, String location) {
        this.cinemaId = cinemaId;
        this.name = name;
        this.location = location;
    }

    // Getters and Setters
    public String getCinemaId() {
        return cinemaId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }
}
