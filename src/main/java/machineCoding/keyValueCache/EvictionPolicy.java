package machineCoding.keyValueCache;

public interface EvictionPolicy<K> {
    void keyAccessed(K key);
    K evictKey();
}

