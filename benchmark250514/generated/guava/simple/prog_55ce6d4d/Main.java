import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableSortedMap using the 'of' method
        /* write */ ImmutableSortedMap<String, Integer> map = ImmutableSortedMap.of("key1", 100, "key2", 200);

        // Read a value from the map using the 'get' method
        /* read */ Integer value = map.get("key1");
        
        // Print the value to verify the read operation
        System.out.println(value);
    }
}