package machineCoding.hashMap;

public class CustomHashMap<K, V> {
    // Entry class for key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Entry<K, V>[] buckets; // Bucket array
    private int capacity;          // Total capacity of the map
    private int size;              // Current number of elements
    private static final float LOAD_FACTOR = 0.75f; // Load factor for resizing

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        this.capacity = 16; // Default initial capacity
        this.buckets = new Entry[capacity];
        this.size = 0;
    }

    // Hash function to compute index
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    // Put method to insert or update a key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Entry<K, V> head = buckets[index];

        // Check if key already exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value; // Update value
                return;
            }
            head = head.next;
        }

        // Insert new key-value pair
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
        size++;

        // Resize if load factor exceeds threshold
        if ((1.0 * size) / capacity >= LOAD_FACTOR) {
            resize();
        }
    }

    // Get method to retrieve a value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null; // Key not found
    }

    // Remove method to delete a key-value pair
    public V remove(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> head = buckets[index];
        Entry<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = head.next; // Remove head node
                } else {
                    prev.next = head.next; // Bypass the node
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null; // Key not found
    }

    // Check if key exists
    public boolean containsKey(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    // Resize the bucket array when the load factor is exceeded
    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = capacity * 2;
        Entry<K, V>[] newBuckets = new Entry[newCapacity];

        for (Entry<K, V> head : buckets) {
            while (head != null) {
                int newIndex = Math.abs(head.key.hashCode() % newCapacity);
                Entry<K, V> next = head.next;

                // Rehash and insert into new bucket
                head.next = newBuckets[newIndex];
                newBuckets[newIndex] = head;

                head = next;
            }
        }

        this.buckets = newBuckets;
        this.capacity = newCapacity;
    }

    // Get the current size of the map
    public int size() {
        return size;
    }

    // Check if the map is empty
    public boolean isEmpty() {
        return size == 0;
    }
}
