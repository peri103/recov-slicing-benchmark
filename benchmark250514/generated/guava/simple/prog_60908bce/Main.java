import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Add a key-value pair using the builder
        /* write */ builder.put("key1", 1);
        
        // Build the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Retrieve the value using the key
        /* read */ Integer value = biMap.get("key1");
        
        // Print the value
        System.out.println(value);
    }
}