import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableListMultimap
        Builder<String, Integer> builder = ImmutableListMultimap.builder();
        
        // Use the builder to add a key-value pair to the multimap
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableListMultimap
        ImmutableListMultimap<String, Integer> multimap = builder.build();
        
        // Retrieve the value associated with the key
        /* read */ java.util.List<Integer> values = multimap.get("key1");
        
        // Print the retrieved value
        System.out.println(values);
    }
}