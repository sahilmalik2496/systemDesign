package LLD.idemptencyHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class IdempotencyRepository {
    private final Map<String, IdempotencyRecord> database = new HashMap<>();

    public Optional<IdempotencyRecord> findByKey(String idempotencyKey) {
        return Optional.ofNullable(database.get(idempotencyKey));
    }

    public void save(IdempotencyRecord record) {
        database.put(record.getIdempotencyKey(), record);
    }

    public void update(String idempotencyKey, String responsePayload, String status) {
        IdempotencyRecord record = database.get(idempotencyKey);
        if (record != null) {
            record.setResponsePayload(responsePayload);
            record.setStatus(status);
        }
    }
}
