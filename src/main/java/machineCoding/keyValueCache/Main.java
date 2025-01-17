package machineCoding.keyValueCache;

public class Main {
    public static void main(String[] args) {
        // LRU Cache Example
        System.out.println("Testing LRU Cache:");
        Cache<Integer, String> lruCache = new KeyValueCache<>(3, new LRUEvictionPolicy<>());

        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");

        System.out.println(lruCache.get(1)); // Access 1 to make it recently used
        lruCache.put(4, "Four"); // Evicts 2 (Least Recently Used)

        System.out.println(lruCache.get(2)); // Should be null
        System.out.println(lruCache.get(3)); // Should be "Three"
        System.out.println(lruCache.get(4)); // Should be "Four"

        // FIFO Cache Example
        System.out.println("\nTesting FIFO Cache:");
        Cache<Integer, String> fifoCache = new KeyValueCache<>(3, new FIFOEvictionPolicy<>());

        fifoCache.put(1, "One");
        fifoCache.put(2, "Two");
        fifoCache.put(3, "Three");

        fifoCache.put(4, "Four"); // Evicts 1 (First In)

        System.out.println(fifoCache.get(1)); // Should be null
        System.out.println(fifoCache.get(2)); // Should be "Two"
        System.out.println(fifoCache.get(4)); // Should be "Four"
    }
}
