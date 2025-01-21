package machineCoding.bookMyShow;

class Seat {
    private String seatId;
    private boolean isAvailable;

    public Seat(String seatId) {
        this.seatId = seatId;
        this.isAvailable = true; // Seat is initially available
    }

    public String getSeatId() {
        return seatId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookSeat() {
        this.isAvailable = false;
    }

    public void cancelSeat() {
        this.isAvailable = true;
    }
}
