package LLD.idemptencyHandler;

import java.util.Optional;

public class ApiService {
    private final IdempotencyKeyManager keyManager = new IdempotencyKeyManager();
    private final IdempotencyRepository repository = new IdempotencyRepository();

    public ApiService() {
    }

    public String handleRequest(String idempotencyKey, String requestPayload) {
        Object lock = keyManager.acquireLock(idempotencyKey);

        synchronized (lock) {
            try {
                // Step 1: Check if the request is already processed
                Optional<IdempotencyRecord> existingRecord = repository.findByKey(idempotencyKey);
                if (existingRecord.isPresent()) {
                    IdempotencyRecord record = existingRecord.get();
                    if ("COMPLETED".equals(record.getStatus())) {
                        return record.getResponsePayload();
                    } else {
                        throw new IllegalStateException("Request is already in progress");
                    }
                }

                // Step 2: Insert a new record to mark the request as in progress
                repository.save(new IdempotencyRecord(
                        idempotencyKey, requestPayload, null, "IN_PROGRESS"
                ));

                // Step 3: Process the request (simulate with a dummy response)
                String responsePayload = processRequest(requestPayload);

                // Step 4: Update the record with the response and mark as completed
                repository.update(idempotencyKey, responsePayload, "COMPLETED");

                return responsePayload;

            } finally {
                keyManager.releaseLock(idempotencyKey);
            }
        }
    }

    private String processRequest(String payload) {
        // Simulate some processing logic
        return "Processed: " + payload;
    }
}
