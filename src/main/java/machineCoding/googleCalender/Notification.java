package machineCoding.googleCalender;

import java.time.LocalDateTime;
import java.util.UUID;

class Notification {
    private String notificationId;
    private User user;
    private Event event;
    private String message;
    private LocalDateTime time;

    public Notification(User user, Event event, String message, LocalDateTime time) {
        this.notificationId = UUID.randomUUID().toString();
        this.user = user;
        this.event = event;
        this.message = message;
        this.time = time;
    }

    public void sendNotification() {
        System.out.println("Sending notification to: " + user.name + " - " + message);
    }
}
