package machineCoding.googleCalender;

import java.time.LocalDateTime;
import java.util.*;

class Event {
    private String eventId;
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String recurrence; // "daily", "weekly", "monthly"
    private List<User> attendees = new ArrayList<>();
    private List<Notification> reminders = new ArrayList<>();

    public Event(String title, LocalDateTime startTime, LocalDateTime endTime, String recurrence) {
        this.eventId = UUID.randomUUID().toString();
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.recurrence = recurrence;
    }

    public String getEventId() {
        return eventId;
    }

    public void addAttendee(User user) {
        attendees.add(user);
    }

    public void setReminder(Notification notification) {
        reminders.add(notification);
    }
}

