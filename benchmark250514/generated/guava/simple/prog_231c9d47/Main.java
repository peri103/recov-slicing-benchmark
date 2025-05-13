import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add a key-value pair to the map using the builder
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Read the value associated with "key1" from the map
        /* read */ Integer value = map.get("key1");
        
        // Print the retrieved value
        System.out.println(value);
    }
}