package machineCoding.inMemoryDataStructure;

import java.util.*;

public class InMemoryDatabase {
    private final Map<String, Record> primaryIndex; // Primary key index
    private final Map<String, Map<Object, Set<String>>> secondaryIndexes; // Secondary indexes

    public InMemoryDatabase() {
        this.primaryIndex = new HashMap<>();
        this.secondaryIndexes = new HashMap<>();
    }

    public void insert(Record record) {
        primaryIndex.put(record.getId(), record);

        // Update secondary indexes
        for (String field : secondaryIndexes.keySet()) {
            Object value = record.getField(field);
            if (value != null) {
                secondaryIndexes.computeIfAbsent(field, k -> new HashMap<>())
                        .computeIfAbsent(value, k -> new HashSet<>())
                        .add(record.getId());
            }
        }
    }

    public Record getByPrimaryKey(String id) {
        return primaryIndex.get(id);
    }

    public Set<Record> getBySecondaryIndex(String fieldName, Object value) {
        Set<String> ids = secondaryIndexes.getOrDefault(fieldName, Collections.emptyMap())
                .getOrDefault(value, Collections.emptySet());
        Set<Record> results = new HashSet<>();
        for (String id : ids) {
            results.add(primaryIndex.get(id));
        }
        return results;
    }

    public void createSecondaryIndex(String fieldName) {
        if (!secondaryIndexes.containsKey(fieldName)) {
            Map<Object, Set<String>> index = new HashMap<>();
            for (Record record : primaryIndex.values()) {
                Object value = record.getField(fieldName);
                if (value != null) {
                    index.computeIfAbsent(value, k -> new HashSet<>()).add(record.getId());
                }
            }
            secondaryIndexes.put(fieldName, index);
        }
    }

    public void delete(String id) {
        Record record = primaryIndex.remove(id);
        if (record != null) {
            for (String field : secondaryIndexes.keySet()) {
                Object value = record.getField(field);
                if (value != null) {
                    Map<Object, Set<String>> index = secondaryIndexes.get(field);
                    Set<String> ids = index.get(value);
                    if (ids != null) {
                        ids.remove(id);
                        if (ids.isEmpty()) {
                            index.remove(value);
                        }
                    }
                }
            }
        }
    }
}
