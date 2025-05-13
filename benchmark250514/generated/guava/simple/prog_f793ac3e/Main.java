import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, String> builder = ImmutableSortedMap.naturalOrder();
        
        // Add a key-value pair to the builder
        /* write */ builder.put("key1", "value1");
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, String> map = builder.build();
        
        // Read the value associated with "key1"
        /* read */ String value = map.get("key1");
        
        // Print the value
        System.out.println(value);
    }
}