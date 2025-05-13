import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a base map and a transformed map
        Map<String, String> baseMap = new HashMap<>();
        TransformedMap<String, String> transformedMap = TransformedMap.transformedMap(
            baseMap, 
            key -> key.toUpperCase(), // Transform keys to uppercase
            value -> value.toLowerCase() // Transform values to lowercase
        );

        /* write */ transformedMap.put("Key1", "VALUE1");
        /* read */ String value = transformedMap.get("KEY1");

        System.out.println(value);
    }
}