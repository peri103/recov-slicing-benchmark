import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Create an instance of a class to store in the map
        String instance = "Hello, World!";
        
        /* write */ builder.putInstance(String.class, instance);
        
        // Create a simple HashMap to demonstrate additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Iterate over the HashMap and print its contents
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Build the immutable map
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Simulate additional operations with another ImmutableMap
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("four", 4, "five", 5);
        
        // Print contents of the immutable map
        for (Map.Entry<String, Integer> entry : immutableMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        /* read */ String retrievedInstance = map.getInstance(String.class);
        
        System.out.println(retrievedInstance);
        
        // Further complexity: Calculate the sum of values in the hashMap
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashMap: " + sum);
    }
}