package machineCoding.keyValueCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUEvictionPolicy<K> implements EvictionPolicy<K> {
    private final LinkedHashMap<K, Boolean> accessOrder;

    public LRUEvictionPolicy() {
        this.accessOrder = new LinkedHashMap<>(16, 0.75f, true);
    }

    @Override
    public void keyAccessed(K key) {
        accessOrder.put(key, true);
    }

    @Override
    public K evictKey() {
        K oldestKey = accessOrder.keySet().iterator().next();
        accessOrder.remove(oldestKey);
        return oldestKey;
    }
}
