import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Write a value into the map
        /* write */ builder.put("key1", 100);
        
        // Build the map
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Read the value from the map
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println(value);
    }
}