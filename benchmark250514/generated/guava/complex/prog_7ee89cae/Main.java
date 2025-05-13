import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an instance to the map using the builder
        /* write */ builder.put(String.class, "Hello, World!");
        
        // Create a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Perform operations on the HashMap
        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        
        // Print the sum of values in the HashMap
        System.out.println("Sum of HashMap values: " + sum);
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Use a HashMap to store additional data
        Map<Class<?>, Object> additionalMap = new HashMap<>();
        additionalMap.put(Integer.class, 42);
        additionalMap.put(Double.class, 3.14);
        
        // Retrieve the instance from the map
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
        
        // Access and print additional data from the HashMap
        Integer intValue = (Integer) additionalMap.get(Integer.class);
        Double doubleValue = (Double) additionalMap.get(Double.class);
        
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
    }
}