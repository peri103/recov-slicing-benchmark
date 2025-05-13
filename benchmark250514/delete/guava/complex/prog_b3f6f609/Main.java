import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();

        // Create a HashMap and add some entries
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Put an instance into the builder
        /* write */ builder.putInstance(String.class, "Hello, World!");

        // Build the ImmutableClassToInstanceMap from the builder
        ImmutableClassToInstanceMap<Object> map = builder.build();

        // Use ImmutableMap to demonstrate other operations
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.copyOf(hashMap);
        int sum = 0;
        for (Integer value : immutableMap.values()) {
            sum += value;
        }

        // Perform some operations with the HashMap
        hashMap.put("Four", 4);
        hashMap.remove("Two");

        // Retrieve the instance from the ImmutableClassToInstanceMap
        /* read */ String value = map.getInstance(String.class);

        // Print the results
        System.out.println("ImmutableClassToInstanceMap value: " + value);
        System.out.println("Sum of ImmutableMap values: " + sum);
        System.out.println("HashMap size: " + hashMap.size());
        System.out.println("HashMap contains 'Two': " + hashMap.containsKey("Two"));
    }
}