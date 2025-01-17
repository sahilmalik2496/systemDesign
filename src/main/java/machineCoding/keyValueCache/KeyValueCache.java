package machineCoding.keyValueCache;

public class KeyValueCache<K, V> implements Cache<K, V> {
    private final int capacity;
    private final CacheStore<K, V> cacheStore;
    private final EvictionPolicy<K> evictionPolicy;

    public KeyValueCache(int capacity, EvictionPolicy<K> evictionPolicy) {
        this.capacity = capacity;
        this.cacheStore = new CacheStore<>();
        this.evictionPolicy = evictionPolicy;
    }

    @Override
    public void put(K key, V value) {
        if (cacheStore.size() >= capacity) {
            K keyToEvict = evictionPolicy.evictKey();
            if (keyToEvict != null) {
                cacheStore.remove(keyToEvict);
            }
        }
        cacheStore.put(key, value);
        evictionPolicy.keyAccessed(key);
    }

    @Override
    public V get(K key) {
        if (!cacheStore.containsKey(key)) {
            return null;
        }
        evictionPolicy.keyAccessed(key);
        return cacheStore.get(key);
    }

    @Override
    public void remove(K key) {
        cacheStore.remove(key);
    }

    @Override
    public boolean containsKey(K key) {
        return cacheStore.containsKey(key);
    }

    @Override
    public int size() {
        return cacheStore.size();
    }
}
