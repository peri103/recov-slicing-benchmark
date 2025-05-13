import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Create a HashMap and populate it with some values
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Add an entry to the builder
        /* write */ builder.put(String.class, "Hello, World!");

        // Perform operations on the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Retrieve the instance using getInstance method
        /* read */ String value = map.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);

        // Create another ImmutableClassToInstanceMap for integers
        Builder<Integer> intBuilder = ImmutableClassToInstanceMap.builder();
        intBuilder.put(Integer.class, 42);
        ImmutableClassToInstanceMap<Integer> intMap = intBuilder.build();

        // Retrieve and print the integer instance
        Integer intValue = intMap.getInstance(Integer.class);
        System.out.println("Integer value: " + intValue);

        // Add more complex logic
        int sum = 0;
        for (Integer val : hashMap.values()) {
            sum += val;
        }
        System.out.println("Sum of HashMap values: " + sum);
    }
}