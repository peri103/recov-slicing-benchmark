import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        
        // Add a key-value pair to the builder
        /* write */ builder.put("key", "value");
        
        // Create a HashMap to store additional data
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        
        // Perform operations on the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, String> multimap = builder.build();
        
        // Create another ImmutableMap for demonstration purposes
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("three", 3, "four", 4);
        
        // Perform operations on the ImmutableMap
        for (Map.Entry<String, Integer> entry : immutableMap.entrySet()) {
            System.out.println("ImmutableMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Read operation: Get the value associated with the key from the multimap
        /* read */ String value = multimap.get("key").get(0);
        
        // Print the value from the multimap
        System.out.println("Multimap Value: " + value);
        
        // Additional operations to make the program more complex
        int sum = 0;
        for (Integer val : hashMap.values()) {
            sum += val;
        }
        System.out.println("Sum of HashMap values: " + sum);
        
        int product = 1;
        for (Integer val : immutableMap.values()) {
            product *= val;
        }
        System.out.println("Product of ImmutableMap values: " + product);
    }
}