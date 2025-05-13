import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Add a key-value pair to the builder
        /* write */ builder.put("one", 1);
        
        // Build the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Read the value associated with the key "one"
        /* read */ Integer value = biMap.get("one");
        
        // Print the value to verify
        System.out.println(value);
    }
}