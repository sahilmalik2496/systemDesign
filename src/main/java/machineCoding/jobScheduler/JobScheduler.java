package machineCoding.jobScheduler;

import java.util.concurrent.*;
import java.util.*;

public class JobScheduler {
    private PriorityQueue<ScheduledJob> jobs;
    private ThreadPoolExecutor executor;
    private boolean running;

    public JobScheduler(int threadPoolSize) {
        this.jobs = new PriorityQueue<>(Comparator.comparingLong(ScheduledJob::getNextRun));
        this.executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(threadPoolSize);
        this.running = false;
    }

    public void addJob(Job job, Trigger trigger) {
        jobs.add(new ScheduledJob(job, trigger));
    }

    public void removeJob(String jobId) {
        jobs.removeIf(scheduledJob -> scheduledJob.getJob().getId().equals(jobId));
    }

    public void start() {
        running = true;
        while (running) {
            try {
                ScheduledJob nextJob = jobs.peek();
                if (nextJob != null && nextJob.getTrigger().shouldRun()) {
                    executor.execute(() -> {
                        nextJob.getJob().execute();
                        if (nextJob.getTrigger() instanceof PeriodicTrigger) {
                            ((PeriodicTrigger) nextJob.getTrigger()).updateLastRunTime();
                            jobs.add(nextJob); // Re-add for periodic execution
                        }
                    });
                    jobs.poll();
                }
                Thread.sleep(100); // Polling interval
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                stop();
            }
        }
    }

    public void stop() {
        running = false;
        executor.shutdown();
    }

    private static class ScheduledJob {
        private Job job;
        private Trigger trigger;

        public ScheduledJob(Job job, Trigger trigger) {
            this.job = job;
            this.trigger = trigger;
        }

        public Job getJob() {
            return job;
        }

        public Trigger getTrigger() {
            return trigger;
        }

        public long getNextRun() {
            return trigger.nextRun();
        }
    }
}
