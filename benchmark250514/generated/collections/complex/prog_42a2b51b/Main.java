import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the map with appropriate reference type
        AbstractReferenceMap<String, String> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);

        // Use the write method to put a value in the map
        /* write */ map.put("key", "value");

        // Create a separate map and add multiple entries
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);

        // Perform operations on the numberMap
        int sum = 0;
        for (String key : numberMap.keySet()) {
            sum += numberMap.get(key);
        }
        System.out.println("Sum of numbers: " + sum);

        // Use the read method to retrieve the value from the map
        /* read */ String retrievedValue = map.get("key");

        // Print the retrieved value to ensure the read method worked correctly
        System.out.println(retrievedValue);

        // Further operations with numberMap
        numberMap.put("four", 4);
        numberMap.put("five", 5);

        int product = 1;
        for (Integer value : numberMap.values()) {
            product *= value;
        }
        System.out.println("Product of numbers: " + product);

        // Additional unrelated operations
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "world");
        stringMap.put("foo", "bar");

        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}