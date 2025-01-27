package machineCoding.meetingScheduler;

import java.util.Date;
import java.util.List;

class Meeting {
    private String id;
    private String title;
    private Date startTime;
    private Date endTime;
    private List<User> participants;
    private String description;

    public Meeting(String id, String title, Date startTime, Date endTime, List<User> participants, String description) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.participants = participants;
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public String getTitle() {
        return title;
    }
}
