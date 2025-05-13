import com.google.common.collect.ImmutableListMultimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        
        // Write operation: Add a key-value pair to the builder
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, String> multimap = builder.build();
        
        // Read operation: Get the value associated with the key
        /* read */ String value = multimap.get("key").get(0);
        
        // Print the value
        System.out.println(value);
    }
}