package machineCoding.restaurantManagementSystem;

class TableReservation {
    private int tableNumber;
    private int capacity;
    private ReservationStatus status;

    public TableReservation(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.status = ReservationStatus.AVAILABLE;
    }

    public boolean isAvailable() {
        return status == ReservationStatus.AVAILABLE;
    }

    public void reserveTable() {
        if (isAvailable()) {
            this.status = ReservationStatus.RESERVED;
        } else {
            throw new IllegalStateException("Table is not available for reservation");
        }
    }

    public void releaseTable() {
        this.status = ReservationStatus.AVAILABLE;
    }
}
