package machineCoding.notificationService;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize components
        LOBManager lobManager = new LOBManager();
        EmailSender emailSender = new EmailSender();
        NotificationService notificationService = new NotificationService(lobManager, emailSender);

        // Create users and whitelist them to LOBs
        User user1 = new User("alice@example.com", Set.of("Finance", "HR"));
        User user2 = new User("bob@example.com", Set.of("HR"));
        User user3 = new User("charlie@example.com", Set.of("Finance"));

        // Add users to LOBs
        lobManager.addUserToLOB("Finance", user1);
        lobManager.addUserToLOB("HR", user1);
        lobManager.addUserToLOB("HR", user2);
        lobManager.addUserToLOB("Finance", user3);

        // Send notifications
        notificationService.sendNotification("Finance", "This is a Finance LOB update.");
        notificationService.sendNotification("HR", "This is an HR LOB update.");
        notificationService.sendNotification("IT", "This is an IT LOB update.");
    }
}
