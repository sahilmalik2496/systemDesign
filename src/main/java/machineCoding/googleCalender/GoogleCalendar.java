package machineCoding.googleCalender;

import java.time.LocalDateTime;

public class GoogleCalendar {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("u1", "Alice", "alice@example.com");
        User user2 = new User("u2", "Bob", "bob@example.com");

        // Create calendar
        Calendar aliceCalendar = user1.createCalendar("Work Calendar");

        // Add event
        Event meeting = new Event("Team Meeting", LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(1).plusHours(1), "weekly");
        aliceCalendar.addEvent(meeting);

        // Share calendar with Bob
        aliceCalendar.shareWithUser(user2, "read");

        // Add notification
        Notification reminder = new Notification(user1, meeting, "Meeting Reminder", LocalDateTime.now().plusDays(1).minusMinutes(30));
        meeting.setReminder(reminder);

        // Simulate sending notification
        reminder.sendNotification();
    }
}
