package machineCoding.googleCalender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Calendar {
    private String calendarId;
    private String name;
    private User owner;
    private List<Event> events = new ArrayList<>();
    private Map<User, String> sharedWith = new HashMap<>(); // User and permission level (read/edit)

    public Calendar(String calendarId, String name, User owner) {
        this.calendarId = calendarId;
        this.name = name;
        this.owner = owner;
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void deleteEvent(String eventId) {
        events.removeIf(e -> e.getEventId().equals(eventId));
    }

    public List<Event> getEvents() {
        return events;
    }

    public void shareWithUser(User user, String permission) {
        sharedWith.put(user, permission);
    }
}
