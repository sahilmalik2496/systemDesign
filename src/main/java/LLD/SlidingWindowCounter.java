package LLD;
/*
Sliding Window Counter Algorithm
The Sliding Window Counter is an enhancement over the Fixed Window Counter. It divides time into smaller intervals (buckets) and calculates the request count dynamically over a "sliding" window, avoiding abrupt resets and reducing burstiness.

How It Works:
Buckets: Divide the time window into smaller time intervals (e.g., 1 second buckets for a 10-second window).
Request Tracking: Maintain a counter for each bucket, keeping track of requests made during that interval.
Sliding Window: When a new request is made, calculate the total count over the last N seconds by summing up the relevant buckets.
Decision:
If the total count exceeds the allowed limit, reject the request.
Otherwise, allow the request and update the bucket for the current interval.
Algorithm
Define Parameters:
windowSize: Total window size (e.g., 10 seconds).
bucketSize: Size of each bucket (e.g., 1 second).
requestLimit: Maximum requests allowed in the window.
Maintain a Bucket Map:
Use a map (or array) to store request counts for each bucket.
Process Requests:
Get the current timestamp.
Identify the bucket corresponding to the current timestamp.
Sum the counts from buckets within the sliding window.
Compare the sum with the request limit:
If within the limit, allow the request.
Otherwise, reject it.
Cleanup:
Remove buckets that are outside the sliding window.

 */
public class SlidingWindowCounter {
}
