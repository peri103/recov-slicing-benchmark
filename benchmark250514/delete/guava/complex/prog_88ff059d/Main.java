import com.google.common.collect.LinkedHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedHashBiMap and a HashMap
        LinkedHashBiMap<String, Integer> map = LinkedHashBiMap.create();
        Map<String, String> stringMap = new HashMap<>();

        // Add some values to the HashMap
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");
        stringMap.put("C", "Cherry");

        // Perform some operations on the HashMap
        if (stringMap.containsKey("A")) {
            System.out.println("Contains key 'A': " + stringMap.get("A"));
        }

        // Insert a value into the LinkedHashBiMap
        /* write */ map.put("key", 42);

        // Add more values to the LinkedHashBiMap
        map.put("anotherKey", 100);
        map.put("yetAnotherKey", 200);

        // Retrieve and print values from LinkedHashBiMap
        System.out.println("Value for 'anotherKey': " + map.get("anotherKey"));
        System.out.println("Value for 'yetAnotherKey': " + map.get("yetAnotherKey"));

        // Perform some operations on the LinkedHashBiMap
        if (map.containsKey("key")) {
            System.out.println("Map contains 'key'.");
        }

        // Retrieve the value inserted earlier
        /* read */ Integer value = map.get("key");
        System.out.println("Retrieved value: " + value);

        // Perform some additional operations
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Add and manipulate more data
        stringMap.put("D", "Date");
        stringMap.remove("B");

        // Print final state of the HashMap
        System.out.println("Final state of stringMap: " + stringMap);
    }
}