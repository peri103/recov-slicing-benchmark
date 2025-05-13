import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Write a key-value pair to the builder
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableBiMap from the builder
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Read the value using the key from the ImmutableBiMap
        /* read */ Integer value = biMap.get("key1");
        
        // Print the read value
        System.out.println(value);
    }
}