import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMap
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        
        // Add key-value pairs using the builder
        /* write */ builder.put("key1", "value1");
        
        // Build the ImmutableMap
        ImmutableMap<String, String> map = builder.build();
        
        // Read the value associated with "key1"
        /* read */ String value = map.get("key1");
        
        // Print the read value
        System.out.println(value);
    }
}