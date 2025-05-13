import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableMap using the 'of' method
        /* write */ ImmutableMap<String, Integer> map = ImmutableMap.of("key1", 1, "key2", 2);

        // Check if the map contains a specific key using the 'containsKey' method
        /* read */ boolean containsKey = map.containsKey("key1");

        // Output the result
        System.out.println("Does the map contain 'key1'? " + containsKey);
    }
}