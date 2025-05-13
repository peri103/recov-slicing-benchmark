import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSetMultimap.Builder;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSetMultimap
        Builder<String, String> builder = ImmutableSetMultimap.builder();
        
        // Add a key-value pair to the builder
        /* write */ builder.put("key1", "value1");
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, String> multimap = builder.build();
        
        // Retrieve the value associated with "key1"
        /* read */ java.util.Set<String> values = multimap.get("key1");
        
        // Print the retrieved values
        for (String value : values) {
            System.out.println(value);
        }
    }
}