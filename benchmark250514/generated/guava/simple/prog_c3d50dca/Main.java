import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Write a key-value pair into the builder
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableSortedMap from the builder
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Read the value associated with the key "key1"
        /* read */ Integer value = map.get("key1");
        
        // Print the read value
        System.out.println(value);
    }
}