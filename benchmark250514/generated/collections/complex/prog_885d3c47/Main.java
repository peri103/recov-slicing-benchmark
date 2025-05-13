import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayListValuedHashMap
        ArrayListValuedHashMap<String, Integer> map = new ArrayListValuedHashMap<>();

        // Initialize a regular HashMap for additional complexity
        Map<String, String> regularMap = new HashMap<>();
        regularMap.put("A", "Apple");
        regularMap.put("B", "Banana");
        regularMap.put("C", "Cherry");

        // Use the write method to insert a value into the map
        /* write */ map.put("key", 42);

        // Perform operations on regularMap
        for (Map.Entry<String, String> entry : regularMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Add more entries to the ArrayListValuedHashMap
        map.put("key", 100);
        map.put("key", 200);
        map.put("anotherKey", 300);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Use the read method to retrieve the value associated with the key
        /* read */ Integer value = map.get("key").iterator().next();

        // Print the retrieved value
        System.out.println("Retrieved value from map: " + value);

        // Further operations on the ArrayListValuedHashMap
        for (String key : map.keySet()) {
            System.out.println("Values for key '" + key + "': " + map.get(key));
        }
    }
}