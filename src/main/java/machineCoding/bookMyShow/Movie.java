package machineCoding.bookMyShow;

class Movie {
    private String movieId;
    private String title;
    private String genre;
    private int duration; // Duration in minutes

    public Movie(String movieId, String title, String genre, int duration) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    // Getters and Setters
    public String getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
}
