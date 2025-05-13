import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();
        TransformedMap<String, String, String, String> transformedMap = TransformedMap.transformedMap(originalMap, null, null);
        
        /* write */ transformedMap.put("key", "value");
        /* read */ String value = transformedMap.get("key");
        
        System.out.println(value);
    }
}