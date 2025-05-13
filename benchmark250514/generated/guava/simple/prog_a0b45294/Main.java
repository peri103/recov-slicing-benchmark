import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Write a key-value pair to the map using the builder
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Read the value from the map using the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println(value);
    }
}