import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, Integer> builder = ImmutableSetMultimap.builder();
        
        // Use the builder to add a key-value pair to the multimap
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, Integer> multimap = builder.build();
        
        // Additional unrelated operations to make the program more complex
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("name", "Alice");
        stringMap.put("city", "Wonderland");
        
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // More complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Retrieve the value associated with "key1"
        /* read */ ImmutableSet<Integer> values = multimap.get("key1");
        
        // Print the retrieved values
        System.out.println(values);
        
        // Additional operations with ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, Integer> builder2 = ImmutableSetMultimap.builder();
        builder2.put("key2", 200);
        builder2.put("key3", 300);
        
        ImmutableSetMultimap<String, Integer> multimap2 = builder2.build();
        
        ImmutableSet<Integer> values2 = multimap2.get("key2");
        System.out.println("Values for key2: " + values2);
    }
}