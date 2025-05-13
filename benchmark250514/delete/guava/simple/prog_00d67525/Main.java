import com.google.common.collect.ImmutableSetMultimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, Integer> builder = ImmutableSetMultimap.builder();
        
        // Use the builder to add a key-value pair to the multimap
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, Integer> multimap = builder.build();
        
        // Retrieve the value associated with "key1"
        /* read */ ImmutableSet<Integer> values = multimap.get("key1");
        
        // Print the retrieved values
        System.out.println(values);
    }
}