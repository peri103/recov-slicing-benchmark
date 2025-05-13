import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize a MultiValuedMap and wrap it with UnmodifiableMultiValuedMap
        MultiValuedMap<String, Integer> multiValuedMap = new MultiValueMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(multiValuedMap);

        // Insert a value into the map
        /* write */ multiValuedMap.put("key", 42);

        // Additional logic to make the program more complex
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        simpleMap.put("C", "Cherry");

        Set<String> keys = simpleMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + simpleMap.get(key));
        }

        // More operations on the MultiValuedMap
        multiValuedMap.put("key", 100);
        multiValuedMap.put("anotherKey", 200);
        multiValuedMap.put("anotherKey", 300);

        // Iterate over the MultiValuedMap
        for (String key : multiValuedMap.keySet()) {
            System.out.println("Values for " + key + ": " + multiValuedMap.get(key));
        }

        // Read the value from the map
        /* read */ Integer value = unmodifiableMap.get("key").iterator().next();
        System.out.println("Read value: " + value);

        // Further operations
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Alice", 85);
        scoreMap.put("Bob", 90);
        scoreMap.put("Charlie", 95);

        int totalScore = 0;
        for (Integer score : scoreMap.values()) {
            totalScore += score;
        }
        System.out.println("Total Score: " + totalScore);

        // Final operations on the MultiValuedMap
        for (String key : multiValuedMap.keySet()) {
            System.out.println("Final values for " + key + ": " + multiValuedMap.get(key));
        }
    }
}