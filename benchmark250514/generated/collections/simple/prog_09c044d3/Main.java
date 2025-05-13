import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a normal HashMap
        Map<String, Integer> normalMap = new HashMap<>();
        
        // Create a TransformedMap from the normalMap
        Map<String, Integer> transformedMap = TransformedMap.transformedMap(
                normalMap, 
                key -> key.toUpperCase(), // Key transformer
                value -> value + 1         // Value transformer
        );

        /* write */ transformedMap.put("key", 42);
        /* read */ int value = transformedMap.get("KEY");
        
        System.out.println(value);
    }
}