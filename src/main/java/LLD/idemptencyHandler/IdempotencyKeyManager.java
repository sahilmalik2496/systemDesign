package LLD.idemptencyHandler;

import java.util.concurrent.ConcurrentHashMap;

public class IdempotencyKeyManager {
    private static final ConcurrentHashMap<String, Object> locks = new ConcurrentHashMap<>();

    public synchronized Object acquireLock(String idempotencyKey) {
        return locks.computeIfAbsent(idempotencyKey, key -> new Object());
    }

    public synchronized void releaseLock(String idempotencyKey) {
        locks.remove(idempotencyKey);
    }
}
