package machineCoding.hotelManagement;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

// Hotel class
class Hotel {
    private String name;
    private String location;
    private List<Room> rooms;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> searchAvailableRooms(RoomType type) {
        return rooms.stream()
                .filter(room -> room.getType() == type && room.isAvailable())
                .collect(Collectors.toList());
    }
}

