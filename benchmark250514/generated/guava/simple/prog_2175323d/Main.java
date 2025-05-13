import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        Builder<String, Integer> builder = ImmutableListMultimap.builder();
        
        // Add a key-value pair using the builder
        /* write */ builder.put("key1", 42);
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, Integer> multimap = builder.build();
        
        // Retrieve the value associated with the key
        /* read */ Integer value = multimap.get("key1").get(0);
        
        // Print the retrieved value
        System.out.println(value);
    }
}