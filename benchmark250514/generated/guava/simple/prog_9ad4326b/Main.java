import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder instance for ImmutableMap
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        
        // Use the builder to add key-value pairs
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableMap
        ImmutableMap<String, String> map = builder.build();
        
        // Read the value using the key
        /* read */ String value = map.get("key");
        
        // Print the value
        System.out.println(value);
    }
}