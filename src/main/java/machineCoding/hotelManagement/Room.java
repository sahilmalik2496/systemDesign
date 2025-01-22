package machineCoding.hotelManagement;

// Room class
class Room {
    private int roomNumber;
    private RoomType type;
    private double price;
    private RoomStatus status;
    private List<Amenity> amenities;

    public Room(int roomNumber, RoomType type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.status = RoomStatus.AVAILABLE;
        this.amenities = new ArrayList<>();
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

    public void addAmenity(Amenity amenity) {
        amenities.add(amenity);
    }
}


