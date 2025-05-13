import com.google.common.collect.ImmutableSetMultimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, String> builder = ImmutableSetMultimap.builder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, String> multimap = builder.build();
        
        // Read the value associated with the key
        /* read */ java.util.Set<String> values = multimap.get("key");
        
        // Print the values
        System.out.println(values);
    }
}