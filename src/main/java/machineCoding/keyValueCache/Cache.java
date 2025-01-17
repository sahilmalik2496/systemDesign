package machineCoding.keyValueCache;

public interface Cache<K, V> {
    void put(K key, V value);
    V get(K key);
    void remove(K key);
    boolean containsKey(K key);
    int size();
}

