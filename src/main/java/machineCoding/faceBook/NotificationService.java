package machineCoding.faceBook;

import java.util.*;

class NotificationService {
    private Map<User, List<String>> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    public void notify(User user, String message) {
        notifications.putIfAbsent(user, new ArrayList<>());
        notifications.get(user).add(message);
    }

    public List<String> getNotifications(User user) {
        return notifications.getOrDefault(user, new ArrayList<>());
    }
}
