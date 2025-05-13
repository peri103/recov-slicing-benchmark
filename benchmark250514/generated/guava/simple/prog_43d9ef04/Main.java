import com.google.common.collect.ImmutableListMultimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key1", "value1");
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, String> multimap = builder.build();
        
        // Read the value associated with the key
        /* read */ java.util.List<String> values = multimap.get("key1");
        
        // Print the value
        System.out.println(values);
    }
}