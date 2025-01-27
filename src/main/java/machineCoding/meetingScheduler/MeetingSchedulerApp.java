package machineCoding.meetingScheduler;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MeetingSchedulerApp {
    public static void main(String[] args) {
        User user1 = new User("1", "Alice", "alice@example.com");
        User user2 = new User("2", "Bob", "bob@example.com");

        List<User> participants = Arrays.asList(user1, user2);

        MeetingScheduler scheduler = new MeetingScheduler();

        Date startTime = new Date(System.currentTimeMillis() + 3600 * 1000); // 1 hour from now
        Date endTime = new Date(System.currentTimeMillis() + 7200 * 1000);   // 2 hours from now

        scheduler.scheduleMeeting("Project Discussion", startTime, endTime, participants, "Discuss project milestones");

        // Attempt to schedule another meeting at the same time
        scheduler.scheduleMeeting("Team Meeting", startTime, endTime, participants, "Weekly team sync");
    }
}
