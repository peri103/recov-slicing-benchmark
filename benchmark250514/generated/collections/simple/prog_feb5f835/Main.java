import org.apache.commons.collections4.map.MultiKeyMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiKeyMap
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();

        // Use the write method to put a value in the map
        /* write */ multiKeyMap.put("key1", "key2", 42);

        // Use the read method to get the value from the map
        /* read */ Integer value = multiKeyMap.get("key1", "key2");

        // Print the retrieved value
        System.out.println(value);
    }
}