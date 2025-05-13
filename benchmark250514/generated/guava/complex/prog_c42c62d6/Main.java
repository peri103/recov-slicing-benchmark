import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();

        // Use the builder to associate a class with an instance
        /* write */ builder.put(String.class, "Hello, World!");

        // Create a regular HashMap for additional complexity
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

        // Create an ImmutableMap for additional complexity
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("Four", 4, "Five", 5, "Six", 6);

        // Perform operations on the ImmutableMap
        immutableMap.forEach((key, value) -> System.out.println("Immutable Key: " + key + ", Immutable Value: " + value));

        // Read the instance associated with the String class
        /* read */ String value = map.getInstance(String.class);

        // Print the value
        System.out.println(value);

        // Perform some additional logic
        int sum = hashMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of HashMap values: " + sum);

        int immutableSum = immutableMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ImmutableMap values: " + immutableSum);
    }
}