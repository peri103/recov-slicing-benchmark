import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // ImmutableMap.Builder is used to create an immutable map
        ImmutableMap.Builder<String, Integer> mapBuilder = ImmutableMap.builder();
        
        // Since ImmutableMap is immutable, we use the builder to add entries
        /* write */ mapBuilder.put("key", 42);
        
        // Build the immutable map
        ImmutableMap<String, Integer> map = mapBuilder.build();
        
        // Read the value associated with the key "key"
        /* read */ Integer value = map.get("key");
        
        // Output the value
        System.out.println(value);
    }
}