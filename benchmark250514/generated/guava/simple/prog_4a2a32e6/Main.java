import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableSortedMap using the 'of' method
        /* write */ ImmutableSortedMap<String, Integer> map = ImmutableSortedMap.of("key", 42);

        // Read the value associated with the key using the 'get' method
        /* read */ Integer value = map.get("key");

        // Print the value to verify the correctness
        System.out.println(value);
    }
}