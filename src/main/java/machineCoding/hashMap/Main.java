package machineCoding.hashMap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        System.out.println("Alice's age: " + map.get("Alice")); // Output: 25
        System.out.println("Contains Bob? " + map.containsKey("Bob")); // Output: true

        map.remove("Alice");
        System.out.println("Contains Alice? " + map.containsKey("Alice")); // Output: false

        System.out.println("Map size: " + map.size()); // Output: 2
    }
}

