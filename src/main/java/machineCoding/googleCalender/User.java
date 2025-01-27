package machineCoding.googleCalender;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


class User {
    private String userId;
    private String name;
    private String email;
    private List<Calendar> calendars = new ArrayList<>();

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public Calendar createCalendar(String calendarName) {
        Calendar calendar = new Calendar(UUID.randomUUID().toString(), calendarName, this);
        calendars.add(calendar);
        return calendar;
    }

    public List<Calendar> getCalendars() {
        return calendars;
    }
}
