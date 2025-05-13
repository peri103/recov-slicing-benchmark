import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableMap
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        
        // Add a key-value pair using the builder
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableMap
        ImmutableMap<String, String> map = builder.build();
        
        // Read the value associated with the key
        /* read */ String value = map.get("key");
        
        // Print the value to ensure it's read correctly
        System.out.println(value);
    }
}