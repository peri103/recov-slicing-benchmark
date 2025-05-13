import org.apache.commons.collections4.map.MultiKeyMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiKeyMap
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();

        // Write a value to the map using multiple keys
        /* write */ multiKeyMap.put("key1", "key2", 42);

        // Read the value using the same keys
        /* read */ Integer value = multiKeyMap.get("key1", "key2");

        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}