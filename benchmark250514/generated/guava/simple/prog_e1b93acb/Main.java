import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        
        // Add an entry to the map using the builder
        /* write */ builder.put("key", 42);
        
        // Build the immutable map
        ImmutableMap<String, Integer> map = builder.build();
        
        // Read the value associated with the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println(value);
    }
}