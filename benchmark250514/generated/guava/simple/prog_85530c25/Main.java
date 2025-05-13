import com.google.common.collect.ImmutableListMultimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, Integer> builder = ImmutableListMultimap.builder();
        
        // Using the builder to add key-value pairs
        /* write */ builder.put("key1", 42);
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, Integer> multimap = builder.build();
        
        // Retrieve value associated with "key1"
        /* read */ Integer value = multimap.get("key1").get(0);
        
        // Print the retrieved value
        System.out.println(value);
    }
}