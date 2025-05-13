import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key", 100);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Read the value from the map using the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println(value);
    }
}