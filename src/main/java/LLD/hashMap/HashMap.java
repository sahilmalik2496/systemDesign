package LLD.hashMap;

import java.util.*;

class HashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private Node<K, V>[] buckets;
    private int size;

    // Node class (Linked List for Chaining)
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // Constructor
    public HashMap() {
        buckets = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    // Compute Hash
    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % buckets.length;
    }

    // Put (Insert/Update)
    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> head = buckets[index];

        // Update existing key
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new key-value pair
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

        // Resize if needed
        if ((float) size / buckets.length >= LOAD_FACTOR) {
            resize();
        }
    }

    // Get (Retrieve value)
    public V get(K key) {
        int index = hash(key);
        Node<K, V> head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null; // Key not found
    }

    // Remove (Delete a key-value pair)
    public void remove(K key) {
        int index = hash(key);
        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = head.next; // Remove first node
                } else {
                    prev.next = head.next; // Remove in middle or end
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // Resize (Double Capacity and Rehash)
    private void resize() {
        Node<K, V>[] oldBuckets = buckets;
        buckets = new Node[oldBuckets.length * 2];
        size = 0;

        for (Node<K, V> head : oldBuckets) {
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

    // Print HashMap (For debugging)
    public void printHashMap() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            Node<K, V> head = buckets[i];
            while (head != null) {
                System.out.print("[" + head.key + "=" + head.value + "] -> ");
                head = head.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert values
        map.put("Sahil", 101);
        map.put("Alice", 200);
        map.put("Bob", 300);
        map.put("Charlie", 400);
        map.put("David", 500);

        // Print
        map.printHashMap();

        // Get values
        System.out.println("Sahil's Value: " + map.get("Sahil"));
        System.out.println("Bob's Value: " + map.get("Bob"));

        // Remove a key
        map.remove("Alice");
        System.out.println("After removing Alice:");
        map.printHashMap();
    }
}

