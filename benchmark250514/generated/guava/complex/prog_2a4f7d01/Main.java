import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an instance to the map using the builder
        /* write */ builder.put(String.class, "Hello, World!");
        
        // Create a HashMap for more complex operations
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Perform operations on the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Perform some unrelated operations
        int sum = 0;
        for (int value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in HashMap: " + sum);
        
        // Retrieve the instance from the map
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
        
        // Additional operations on HashMap
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);
        
        int product = 1;
        for (int val : hashMap.values()) {
            product *= val;
        }
        System.out.println("Product of values in HashMap: " + product);
    }
}