package machineCoding.notificationService;

import java.util.List;

public class NotificationService {
    private final LOBManager lobManager;
    private final EmailSender emailSender;

    public NotificationService(LOBManager lobManager, EmailSender emailSender) {
        this.lobManager = lobManager;
        this.emailSender = emailSender;
    }

    public void sendNotification(String lob, String message) {
        List<User> users = lobManager.getUsersByLOB(lob);
        if (users.isEmpty()) {
            System.out.println("No users are whitelisted for LOB: " + lob);
            return;
        }

        for (User user : users) {
            emailSender.sendEmail(user.getEmail(), "Notification for LOB: " + lob, message);
        }
    }
}

