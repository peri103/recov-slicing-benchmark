import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Create a ReferenceMap with default reference types (hard keys, hard values)
        ReferenceMap<String, String> map = new ReferenceMap<>();

        // Use the put method to write a key-value pair to the map
        /* write */ map.put("key1", "value1");

        // Use the get method to read the value associated with the key
        /* read */ String value = map.get("key1");

        // Print the value to verify the operations
        System.out.println(value);
    }
}