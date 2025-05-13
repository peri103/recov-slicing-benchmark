import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a mutable map to use with UnmodifiableMap
        Map<String, String> mutableMap = new HashMap<>();
        
        // Wrap the mutable map with UnmodifiableMap
        Map<String, String> unmodifiableMap = UnmodifiableMap.unmodifiableMap(mutableMap);
        
        // Perform write operation
        /* write */ mutableMap.put("key", "value");
        
        // Perform read operation
        /* read */ String value = unmodifiableMap.get("key");
        
        // Output the value
        System.out.println(value);
    }
}