import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap as the base map
        Map<String, String> baseMap = new HashMap<>();

        // Create a TransformedMap with identity transformers (no transformation)
        TransformedMap<String, String> transformedMap = TransformedMap.transformedMap(baseMap, null, null);

        // Use the write method to put a value into the map
        /* write */ transformedMap.put("key", "value");

        // Use the read method to get the value from the map
        /* read */ String value = transformedMap.get("key");

        // Print the value to verify it was read correctly
        System.out.println(value);
    }
}