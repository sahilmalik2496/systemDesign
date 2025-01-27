package machineCoding.meetingScheduler;

import java.util.Date;

class ConflictChecker {
    public boolean hasConflict(User user, Date startTime, Date endTime) {
        for (Meeting meeting : user.getCalendar().getMeetings()) {
            if (meeting.getStartTime().before(endTime) && meeting.getEndTime().after(startTime)) {
                return true;
            }
        }
        return false;
    }
}
