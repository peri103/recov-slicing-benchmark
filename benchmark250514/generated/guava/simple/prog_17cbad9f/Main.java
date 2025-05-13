import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Add entries to the builder
        builder.put("one", 1);
        builder.put("two", 2);
        
        // Build the ImmutableBiMap
        /* write */ ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Read a value from the ImmutableBiMap
        /* read */ Integer value = biMap.get("one");
        
        // Print the value
        System.out.println(value);
    }
}