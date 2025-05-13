import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultimap
        Builder<String, String> builder = ImmutableMultimap.builder();
        
        // Add multiple entries to the builder
        builder.put("key1", "value1");
        builder.put("key2", "value2");
        builder.put("key3", "value3");
        
        // Original write operation
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableMultimap
        ImmutableMultimap<String, String> multimap = builder.build();
        
        // Create a regular Multimap for additional operations
        Multimap<String, String> regularMultimap = ArrayListMultimap.create();
        regularMultimap.put("anotherKey", "anotherValue");
        
        // Create a HashMap for unrelated operations
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Perform some operations on the HashMap
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in HashMap: " + sum);
        
        // Perform operations on the regular Multimap
        for (String key : regularMultimap.keySet()) {
            System.out.println("Values for " + key + ": " + regularMultimap.get(key));
        }
        
        // Original read operation
        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println(value);
        
        // Additional unrelated operations
        regularMultimap.put("anotherKey", "additionalValue");
        for (String key : regularMultimap.keySet()) {
            System.out.println("Updated values for " + key + ": " + regularMultimap.get(key));
        }
    }
}