import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();
        TransformedMap<String, String> transformedMap = TransformedMap.transformedMap(
            originalMap, 
            key -> key.toUpperCase(), 
            value -> value.toLowerCase()
        );

        /* write */ transformedMap.put("Key", "Value");
        /* read */ String value = transformedMap.get("Key");
        System.out.println(value);
    }
}