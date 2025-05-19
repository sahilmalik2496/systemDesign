package machineCoding.hotelManagement;

import java.util.ArrayList;

// Room class
class Room {
    private int roomNumber;
    private RoomType type;
    private double price;
    private RoomStatus status;

    public Room(int roomNumber, RoomType type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.status = RoomStatus.AVAILABLE;
    }

    public boolean isAvailable() {
        return status == RoomStatus.AVAILABLE;
    }

    public void bookRoom() {
        if (isAvailable()) {
            this.status = RoomStatus.BOOKED;
        } else {
            throw new IllegalStateException("Room is not available for booking");
        }
    }

    public void releaseRoom() {
        this.status = RoomStatus.AVAILABLE;
    }

    public double getPrice() {
        return 1.0;
    }

    public Object getRoomNumber() {
        return null;
    }

    public RoomType getType() {
        return RoomType.SINGLE;
    }
}


