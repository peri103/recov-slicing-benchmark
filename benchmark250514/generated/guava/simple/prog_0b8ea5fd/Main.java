import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Use the builder to add a key-value pair to the map
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Read the value associated with "key1"
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println(value);
    }
}