import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();
        
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println(value);
    }
}