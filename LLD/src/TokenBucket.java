import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
Token Bucket Algorithm
The Token Bucket Algorithm is a rate-limiting algorithm used to control the amount of data sent to a network or API. It uses tokens to regulate the flow of requests. Each request consumes one token, and tokens are added to the bucket at a constant rate.

How It Works
Bucket Capacity: The bucket can hold a fixed maximum number of tokens.
Token Refill Rate: Tokens are added to the bucket at a fixed rate (e.g., one token per second).
Request Handling:
If a request arrives and there are tokens in the bucket, the token is consumed, and the request is allowed.
If the bucket is empty, the request is denied or delayed.
Implementation in Java
Below is the Java implementation of the Token Bucket Algorithm:
 */



public class TokenBucket {
    private final int capacity; // Maximum number of tokens in the bucket
    private final int refillRate; // Tokens added per second
    private int tokens; // Current number of tokens in the bucket
    private final ScheduledExecutorService scheduler;

    public TokenBucket(int capacity, int refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.tokens = capacity; // Initially, the bucket is full
        this.scheduler = Executors.newScheduledThreadPool(1);

        // Schedule a task to refill tokens at the specified rate
        scheduler.scheduleAtFixedRate(() -> {
            synchronized (this) {
                tokens = Math.min(capacity, tokens + refillRate);
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    // Method to allow or deny a request
    public synchronized boolean allowRequest() {
        if (tokens > 0) {
            tokens--;
            return true; // Request is allowed
        } else {
            return false; // Request is denied
        }
    }

    // Shut down the scheduler when no longer needed
    public void stopRefill() {
        scheduler.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        // Create a token bucket with a capacity of 5 tokens and a refill rate of 1 token/second
        TokenBucket tokenBucket = new TokenBucket(5, 1);

        // Simulate 10 requests
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(200); // Simulate requests arriving every 500ms
            if (tokenBucket.allowRequest()) {
                System.out.println("Request " + i + ": Allowed");
            } else {
                System.out.println("Request " + i + ": Denied");
            }
        }

        // Stop the token refilling process
        tokenBucket.stopRefill();
    }
}
