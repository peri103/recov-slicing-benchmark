import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Write a key-value pair to the map using the builder
        /* write */ builder.put("key", 42);
        
        // Perform some unrelated operations
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "apple");
        hashMap.put("b", "banana");
        
        ImmutableMap.Builder<String, String> immutableBuilder = ImmutableMap.builder();
        immutableBuilder.putAll(hashMap);
        ImmutableMap<String, String> immutableMap = immutableBuilder.build();
        
        for (Map.Entry<String, String> entry : immutableMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Read the value from the map using the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println(value);
        
        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}