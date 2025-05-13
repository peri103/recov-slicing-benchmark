import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Use the builder to add a mapping (write operation)
        /* write */ builder.put(String.class, "Hello World");
        
        // Create a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Perform some operations on the HashMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of HashMap values: " + sum);

        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Perform additional operations for complexity
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);
        
        int product = 1;
        for (Integer value : hashMap.values()) {
            product *= value;
        }
        System.out.println("Product of HashMap values: " + product);

        // Retrieve the instance using the class (read operation)
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println("Retrieved value: " + value);
        
        // More operations for additional complexity
        if (hashMap.containsKey("Three")) {
            System.out.println("HashMap contains key 'Three'");
        }
        
        hashMap.remove("One");
        System.out.println("HashMap after removing 'One': " + hashMap);
    }
}