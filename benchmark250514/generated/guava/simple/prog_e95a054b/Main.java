import com.google.common.collect.ImmutableSetMultimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, String> builder = ImmutableSetMultimap.builder();
        
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, String> multimap = builder.build();
        
        /* read */ java.util.Set<String> values = multimap.get("key");
        
        // Print the values retrieved from the multimap
        for (String value : values) {
            System.out.println(value);
        }
    }
}