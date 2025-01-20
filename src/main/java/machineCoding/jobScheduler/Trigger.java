package machineCoding.jobScheduler;

public interface Trigger {
    boolean shouldRun();
    long nextRun();
}