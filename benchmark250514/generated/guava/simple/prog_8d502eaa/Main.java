import com.google.common.collect.ImmutableSetMultimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, Integer> builder = ImmutableSetMultimap.builder();
        
        /* write */ builder.put("key", 1);
        
        // Build the ImmutableSetMultimap
        ImmutableSetMultimap<String, Integer> multimap = builder.build();
        
        /* read */ java.util.Set<Integer> values = multimap.get("key");
        
        // Print the values
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}