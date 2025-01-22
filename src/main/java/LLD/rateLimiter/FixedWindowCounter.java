package LLD.rateLimiter;

/*
Explanation of Fixed Window Counter
The Fixed Window Counter algorithm is commonly used in rate-limiting to manage a fixed number of requests or actions within a predefined time window. For example, a user might be allowed to make up to 100 requests in one minute.

In this method:

The time is divided into fixed-length windows (e.g., 1 minute).
A counter is maintained for each window to track the number of requests or actions.
When a request is received:
The algorithm checks if it falls within the current window.
If the number of requests exceeds the allowed threshold, the request is denied.
Otherwise, the request is allowed, and the counter is incremented.
At the end of each window, the counter resets.
Algorithm for Fixed Window Counter
Initialize Variables:
start_time: The start time of the current window.
window_size: The duration of the fixed window (e.g., 60 seconds).
request_limit: The maximum number of requests allowed in a window.
counter: A variable to keep track of requests in the current window.
Process Each Request:
Get the current timestamp.
Check if the current timestamp falls within the current window:
If yes:
Increment the counter.
If counter > request_limit, reject the request.
Otherwise, allow the request.
If no:
Reset the counter to 1.
Set the start_time to the current timestamp.
Allow the request.
Reject or Allow Requests:
If the counter exceeds the threshold, reject the request; otherwise, process it.



Explanation of the Code
Class Variables:
requestLimit: Maximum allowed requests within the fixed window.
windowSize: Length of the time window in milliseconds.
startTime: Timestamp marking the beginning of the current window.
counter: Tracks the number of requests in the current window.
Constructor:
Initializes the requestLimit, windowSize, and sets startTime to the current timestamp.
allowRequest Method:
Checks whether the current time is within the active window.
If within the same window:
Increments the counter if the request is within the limit.
Denies the request if the counter exceeds the limit.
If outside the current window:
Resets the counter and starts a new window.
Allows the request.
Main Method:
Simulates a series of requests with a 2-second interval between them.
Prints whether each request is allowed or denied based on the rate-limiting logic.
Key Points
Thread-Safety: The allowRequest method is synchronized to handle concurrent access in multithreaded environments.
Window Size: The window size is specified in seconds but converted to milliseconds for precision.
Testing: Simulated with Thread.sleep to mimic a realistic time interval between requests.
This implementation provides a basic and efficient Fixed Window Counter for rate-limiting in Java.


 */
import java.time.Instant;

public class FixedWindowCounter {
    private final int requestLimit;  // Maximum number of requests allowed in a window
    private final long windowSize;  // Window size in milliseconds
    private long startTime;         // Start time of the current window
    private int counter;            // Counter for the number of requests in the current window

    public FixedWindowCounter(int requestLimit, long windowSizeInSeconds) {
        this.requestLimit = requestLimit;
        this.windowSize = windowSizeInSeconds * 1000; // Convert seconds to milliseconds
        this.startTime = Instant.now().toEpochMilli();
        this.counter = 0;
    }

    public synchronized boolean allowRequest() {
        long currentTime = Instant.now().toEpochMilli();

        // Check if the current time is within the same window
        if (currentTime - startTime < windowSize) {
            if (counter < requestLimit) {
                counter++;
                return true; // Allow the request
            } else {
                return false; // Deny the request (rate limit exceeded)
            }
        } else {
            // Reset the counter and start a new window
            startTime = currentTime;
            counter = 1;
            return true; // Allow the request
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int requestLimit = 5;  // Maximum 5 requests per window
        int windowSizeInSeconds = 5; // Window size is 10 seconds
        FixedWindowCounter rateLimiter = new FixedWindowCounter(requestLimit, windowSizeInSeconds);

        // Simulate requests
        for (int i = 1; i <= 10; i++) {
            if (rateLimiter.allowRequest()) {
                System.out.println("Request " + i + ": Allowed");
            } else {
                System.out.println("Request " + i + ": Denied");
            }
            Thread.sleep(1000); // Simulate a 2-second interval between requests
        }
    }
}
