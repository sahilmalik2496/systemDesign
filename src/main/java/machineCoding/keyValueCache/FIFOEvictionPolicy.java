package machineCoding.keyValueCache;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOEvictionPolicy<K> implements EvictionPolicy<K> {
    private final Queue<K> accessQueue;

    public FIFOEvictionPolicy() {
        this.accessQueue = new LinkedList<>();
    }

    @Override
    public void keyAccessed(K key) {
        if (!accessQueue.contains(key)) {
            accessQueue.add(key);
        }
    }

    @Override
    public K evictKey() {
        return accessQueue.poll();
    }
}
