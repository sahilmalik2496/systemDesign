package machineCoding.meetingScheduler;

import java.util.Date;
import java.util.List;
import java.util.UUID;

class MeetingScheduler {
    private ConflictChecker conflictChecker;

    public MeetingScheduler() {
        this.conflictChecker = new ConflictChecker();
    }

    public boolean scheduleMeeting(String title, Date startTime, Date endTime, List<User> participants, String description) {
        for (User participant : participants) {
            if (conflictChecker.hasConflict(participant, startTime, endTime)) {
                System.out.println("Conflict detected for user: " + participant.getName());
                return false;
            }
        }

        Meeting meeting = new Meeting(UUID.randomUUID().toString(), title, startTime, endTime, participants, description);
        for (User participant : participants) {
            participant.getCalendar().addMeeting(meeting);
        }

        System.out.println("Meeting scheduled successfully: " + title);
        return true;
    }
}
