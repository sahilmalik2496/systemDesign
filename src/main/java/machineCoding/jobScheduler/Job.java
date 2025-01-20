package machineCoding.jobScheduler;

public class Job {
    private String id;
    private String name;
    private int priority;
    private Runnable runnable;

    public Job(String id, String name, int priority, Runnable runnable) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.runnable = runnable;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void execute() {
        runnable.run();
    }
}
