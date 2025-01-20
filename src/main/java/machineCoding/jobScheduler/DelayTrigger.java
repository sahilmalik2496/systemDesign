package machineCoding.jobScheduler;

public class DelayTrigger implements Trigger {
    private long delay;
    private long startTime;

    public DelayTrigger(long delay) {
        this.delay = delay;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public boolean shouldRun() {
        return System.currentTimeMillis() >= (startTime + delay);
    }

    @Override
    public long nextRun() {
        return startTime + delay;
    }
}

