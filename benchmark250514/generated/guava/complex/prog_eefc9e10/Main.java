import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableMultimap
        Builder<String, Integer> builder = ImmutableMultimap.builder();
        
        // Add elements to the builder
        builder.put("key1", 10);
        builder.put("key2", 20);
        
        // Use a different Multimap implementation
        Multimap<String, Integer> arrayListMultimap = ArrayListMultimap.create();
        arrayListMultimap.put("keyA", 100);
        arrayListMultimap.put("keyB", 200);
        
        // Perform some operations on the ArrayListMultimap
        for (String key : arrayListMultimap.keySet()) {
            System.out.println("ArrayListMultimap key: " + key + ", values: " + arrayListMultimap.get(key));
        }

        // Original write operation
        /* write */ builder.put("key", 42);

        // Build the ImmutableMultimap
        ImmutableMultimap<String, Integer> multimap = builder.build();

        // Perform operations on the ImmutableMultimap
        for (String key : multimap.keySet()) {
            System.out.println("ImmutableMultimap key: " + key + ", values: " + multimap.get(key));
        }
        
        // Original read operation
        /* read */ Integer value = multimap.get("key").iterator().next();
        
        // Print the value obtained from the read operation
        System.out.println("Read value: " + value);

        // Additional complex operations
        int sum = 0;
        for (Integer val : arrayListMultimap.values()) {
            sum += val;
        }
        System.out.println("Sum of ArrayListMultimap values: " + sum);
        
        int product = 1;
        for (Integer val : multimap.values()) {
            product *= val;
        }
        System.out.println("Product of ImmutableMultimap values: " + product);
    }
}