package machineCoding.inMemoryDataStructure;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        InMemoryDatabase db = new InMemoryDatabase();

        // Insert records
        db.insert(new Record("1", Map.of("name", "Alice", "age", 30)));
        db.insert(new Record("2", Map.of("name", "Bob", "age", 25)));
        db.insert(new Record("3", Map.of("name", "Alice", "age", 35)));

        // Create secondary index on "name"
        db.createSecondaryIndex("name");

        // Query by primary key
        System.out.println("Record with ID 1: " + db.getByPrimaryKey("1"));

        // Query by secondary index
        System.out.println("Records with name Alice: " + db.getBySecondaryIndex("name", "Alice"));

        // Delete a record
        db.delete("1");
        System.out.println("After deleting ID 1: " + db.getByPrimaryKey("1"));
    }
}
