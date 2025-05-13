import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableMultimap
        Builder<String, Integer> builder = ImmutableMultimap.builder();
        
        // Create and populate a HashMap for demonstration
        Map<String, Integer> map = new HashMap<>();
        map.put("exampleKey1", 100);
        map.put("exampleKey2", 200);

        // Add entries from the map to the ImmutableMultimap builder
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            builder.put(entry.getKey(), entry.getValue());
        }

        // Original write operation
        /* write */ builder.put("key1", 42);

        // Add more data to the builder
        builder.put("key2", 84);
        builder.put("key3", 126);

        // Build the ImmutableMultimap
        ImmutableMultimap<String, Integer> multimap = builder.build();

        // Perform some operations on the multimap
        for (String key : multimap.keySet()) {
            System.out.println("Values for " + key + ": " + multimap.get(key));
        }

        // Original read operation
        /* read */ Integer value = multimap.get("key1").iterator().next();
        System.out.println("Read value: " + value);

        // Additional complex operations with another multimap
        Builder<String, String> stringBuilder = ImmutableMultimap.builder();
        stringBuilder.put("animal", "cat");
        stringBuilder.put("animal", "dog");
        stringBuilder.put("vehicle", "car");
        ImmutableMultimap<String, String> stringMultimap = stringBuilder.build();
        
        for (String key : stringMultimap.keySet()) {
            System.out.println("String values for " + key + ": " + stringMultimap.get(key));
        }
    }
}