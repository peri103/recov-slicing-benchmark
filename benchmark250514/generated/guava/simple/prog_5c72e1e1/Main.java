import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add a key-value pair to the builder
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Read the value associated with the key
        /* read */ Integer value = map.get("key");
        
        // Output the value
        System.out.println(value);
    }
}