package machineCoding.jobScheduler;

public class SchedulerExample {
    public static void main(String[] args) {
        JobScheduler scheduler = new JobScheduler(5);

        // Create a one-time job
        Job oneTimeJob = new Job("1", "One-Time Job", 1, () -> System.out.println("Running one-time job!"));
        scheduler.addJob(oneTimeJob, new DelayTrigger(2000)); // Delay of 2 seconds

        // Create a periodic job
        Job periodicJob = new Job("2", "Periodic Job", 2, () -> System.out.println("Running periodic job!"));
        scheduler.addJob(periodicJob, new PeriodicTrigger(3000)); // Runs every 3 seconds

        // Start the scheduler
        new Thread(scheduler::start).start();

        // Stop the scheduler after 10 seconds
        new Thread(() -> {
            try {
                Thread.sleep(10000);
                scheduler.stop();
                System.out.println("Scheduler stopped!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

