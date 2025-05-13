import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultimap
        Builder<String, Integer> builder = ImmutableMultimap.builder();
        
        // Use the write method to add a key-value pair
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableMultimap
        ImmutableMultimap<String, Integer> multimap = builder.build();
        
        // Use the read method to retrieve the value associated with the key
        /* read */ Integer value = multimap.get("key").iterator().next();
        
        // Print the retrieved value
        System.out.println(value);
    }
}