import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add an entry to the map
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Retrieve the value associated with the key
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println(value);
    }
}