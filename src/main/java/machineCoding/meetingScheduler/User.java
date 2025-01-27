package machineCoding.meetingScheduler;

class User {
    private String id;
    private String name;
    private String email;
    private Calendar calendar;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.calendar = new Calendar();
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public String getName() {
        return name;
    }
}

