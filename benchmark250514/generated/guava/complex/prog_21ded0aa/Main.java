import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Use a HashMap to store some temporary data
        Map<String, Integer> tempMap = new HashMap<>();
        tempMap.put("tempKey1", 100);
        tempMap.put("tempKey2", 200);
        
        // Perform some operations on the HashMap
        for (String key : tempMap.keySet()) {
            System.out.println("HashMap key: " + key + ", value: " + tempMap.get(key));
        }
        
        // Add entries to the ImmutableBiMap builder
        builder.put("key1", 10);
        builder.put("key2", 20);
        
        // Perform some calculations or operations
        int sum = 0;
        for (Integer value : tempMap.values()) {
            sum += value;
        }
        System.out.println("Sum of HashMap values: " + sum);
        
        // Add the original write-read pair
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Use another ImmutableMap for additional operations
        ImmutableMap<String, String> immutableMap = ImmutableMap.of("A", "Apple", "B", "Banana");
        
        // Iterate over the ImmutableMap
        for (Map.Entry<String, String> entry : immutableMap.entrySet()) {
            System.out.println("ImmutableMap key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        
        // Retrieve and print a value from the ImmutableBiMap
        /* read */ Integer value = biMap.get("key");
        
        // Print the retrieved value
        System.out.println("Retrieved value from ImmutableBiMap: " + value);
        
        // Perform some additional operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
    }
}