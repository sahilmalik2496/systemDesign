package LLD;

/*
Leaky Bucket Algorithm
The Leaky Bucket Algorithm is used for rate limiting and traffic shaping, similar to the Token Bucket Algorithm. It ensures that requests or packets are processed at a consistent rate, regardless of the incoming burst rate. Any overflow (if the bucket is full) is discarded.

How It Works
Bucket Capacity: The bucket can hold a fixed number of requests/packets.
Leak Rate: The bucket "leaks" at a fixed rate, representing the system's processing capacity.
Request Handling:
If a request arrives and the bucket is not full, it is added to the bucket.
If the bucket is full, the request is dropped.


Code Explanation
Bucket Parameters:

capacity: Maximum number of requests the bucket can hold.
leakRate: Number of requests processed (leaked) per second.
Leaking Process:

Scheduled every second using scheduleAtFixedRate.
Reduces the current water level (currentWater) by leakRate.
Request Handling:

If the bucket is not full (currentWater < capacity), the request is added, and the water level increases by 1.
If the bucket is full, the request is denied.
Simulation:

Requests are simulated to arrive every 500ms.


 */
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LeakyBucket {
    private final int capacity; // Maximum capacity of the bucket
    private int currentWater; // Current amount of water (requests) in the bucket
    private final int leakRate; // Rate at which the bucket leaks
    private final ScheduledExecutorService scheduler;

    public LeakyBucket(int capacity, int leakRate) {
        this.capacity = capacity;
        this.leakRate = leakRate;
        this.currentWater = 0; // Initially, the bucket is empty
        this.scheduler = Executors.newScheduledThreadPool(1);

        // Schedule the leaking process
        scheduler.scheduleAtFixedRate(this::leak, 0, 1, TimeUnit.SECONDS);
    }

    // Leak water from the bucket
    private synchronized void leak() {
        if (currentWater > 0) {
            currentWater = Math.max(0, currentWater - leakRate);
            System.out.println("Leaking... Current water level: " + currentWater);
        }
    }

    // Add a request to the bucket
    public synchronized void addRequest() {
        if (currentWater < capacity) {
            currentWater++;
            System.out.println("Request added. Current water level: " + currentWater);
        } else {
            System.out.println("Bucket full. Request denied.");
        }
    }

    // Stop the leaking process
    public void stopLeak() {
        scheduler.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        // Create a leaky bucket with a capacity of 5 and a leak rate of 1 request/second
        LeakyBucket leakyBucket = new LeakyBucket(5, 1);

        // Simulate incoming requests
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(500); // Requests arrive every 500ms
            leakyBucket.addRequest();
        }

        // Stop the leaking process after the simulation
        leakyBucket.stopLeak();
    }
}
