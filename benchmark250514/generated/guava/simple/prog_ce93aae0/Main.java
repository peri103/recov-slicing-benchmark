import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, String> builder = ImmutableBiMap.builder();
        
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableBiMap
        ImmutableBiMap<String, String> biMap = builder.build();
        
        /* read */ String value = biMap.get("key");
        
        // Output the value
        System.out.println(value);
    }
}