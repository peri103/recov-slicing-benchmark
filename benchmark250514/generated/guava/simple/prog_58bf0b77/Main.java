import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for an ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();
        
        // Read the value associated with the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println(value);
    }
}