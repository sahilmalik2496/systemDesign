package machineCoding.linkdin;

import java.util.*;

class NotificationService {
    private final Map<String, List<Notification>> userNotifications;

    public NotificationService() {
        this.userNotifications = new HashMap<>();
    }

    public void sendNotification(String userId, String message) {
        Notification notification = new Notification(UUID.randomUUID().toString(), userId, message);
        userNotifications.putIfAbsent(userId, new ArrayList<>());
        userNotifications.get(userId).add(notification);
    }

    public List<Notification> getNotifications(String userId) {
        return userNotifications.getOrDefault(userId, new ArrayList<>());
    }
}
