package machineCoding.linkdin;

import java.util.Date;

class Notification {
    private final String notificationId;
    private final String userId;
    private final String message;
    private final Date timestamp;

    public Notification(String notificationId, String userId, String message) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.timestamp = new Date();
    }

    public String getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
