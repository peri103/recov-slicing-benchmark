import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        
        // Since ImmutableMap does not support put method, we simulate it using the builder
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();
        
        // Use the get method to read the value
        /* read */ Integer value = map.get("key");
        
        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}