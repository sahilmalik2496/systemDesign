package machineCoding.keyValueCache;

import java.util.HashMap;
import java.util.Map;

public class CacheStore<K, V> {
    private final Map<K, V> store;

    public CacheStore() {
        this.store = new HashMap<>();
    }

    public void put(K key, V value) {
        store.put(key, value);
    }

    public V get(K key) {
        return store.get(key);
    }

    public void remove(K key) {
        store.remove(key);
    }

    public boolean containsKey(K key) {
        return store.containsKey(key);
    }

    public int size() {
        return store.size();
    }
}
