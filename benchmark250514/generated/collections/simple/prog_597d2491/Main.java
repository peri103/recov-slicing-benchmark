import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Create a ReferenceMap instance
        ReferenceMap<String, String> map = new ReferenceMap<>();

        // Use the write method to add a key-value pair to the map
        /* write */ map.put("key", "value");

        // Use the read method to retrieve the value associated with the key
        /* read */ String value = map.get("key");

        // Output the retrieved value
        System.out.println(value);
    }
}