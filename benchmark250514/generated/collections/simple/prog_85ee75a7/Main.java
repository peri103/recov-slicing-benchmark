import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap to be transformed
        Map<String, Integer> originalMap = new HashMap<>();
        
        // Create a TransformedMap using the original map
        TransformedMap<String, Integer> transformedMap = TransformedMap.transformedMap(
            originalMap,
            key -> key.toUpperCase(), // Key transformer: Convert keys to uppercase
            value -> value * 2         // Value transformer: Double the values
        );

        // Use the write method to put a value in the map
        /* write */ transformedMap.put("key", 42);
        
        // Use the read method to get the value from the map
        /* read */ Integer value = transformedMap.get("KEY");
        
        // Print the value
        System.out.println(value);
    }
}