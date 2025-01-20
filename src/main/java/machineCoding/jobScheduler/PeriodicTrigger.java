package machineCoding.jobScheduler;

public class PeriodicTrigger implements Trigger {
    private long interval;
    private long lastRunTime;

    public PeriodicTrigger(long interval) {
        this.interval = interval;
        this.lastRunTime = 0;
    }

    @Override
    public boolean shouldRun() {
        return System.currentTimeMillis() >= (lastRunTime + interval);
    }

    @Override
    public long nextRun() {
        return lastRunTime + interval;
    }

    public void updateLastRunTime() {
        this.lastRunTime = System.currentTimeMillis();
    }
}

