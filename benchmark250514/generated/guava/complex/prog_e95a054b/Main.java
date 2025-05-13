import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, String> builder = ImmutableSetMultimap.builder();
        
        // Create another builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, Integer> listBuilder = ImmutableListMultimap.builder();
        
        // Create a HashMap for demonstration
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        
        // Populate the ImmutableListMultimap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            listBuilder.put(entry.getKey(), entry.getValue());
        }
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, Integer> listMultimap = listBuilder.build();
        
        // Perform operations on the ImmutableListMultimap
        for (String key : listMultimap.keySet()) {
            for (Integer value : listMultimap.get(key)) {
                System.out.println("ListMultimap - Key: " + key + ", Value: " + value);
            }
        }
        
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, String> multimap = builder.build();
        
        // Perform some unrelated operations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);
        
        /* read */ java.util.Set<String> values = multimap.get("key");
        
        // Print the values retrieved from the multimap
        for (String value : values) {
            System.out.println("SetMultimap - Value: " + value);
        }
        
        // Additional operations for complexity
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("X", "Hello");
        anotherMap.put("Y", "World");
        
        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println("AnotherMap - Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}