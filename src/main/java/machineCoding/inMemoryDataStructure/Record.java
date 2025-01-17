package machineCoding.inMemoryDataStructure;

import java.util.HashMap;
import java.util.Map;

public class Record {
    private final String id; // Primary Key
    private final Map<String, Object> fields;

    public Record(String id, Map<String, Object> fields) {
        this.id = id;
        this.fields = new HashMap<>(fields);
    }

    public String getId() {
        return id;
    }

    public Object getField(String fieldName) {
        return fields.get(fieldName);
    }

    public Map<String, Object> getFields() {
        return new HashMap<>(fields);
    }
}

