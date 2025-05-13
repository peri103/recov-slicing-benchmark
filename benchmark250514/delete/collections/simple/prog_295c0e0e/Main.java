import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable map
        Map<String, String> modifiableMap = new HashMap<>();
        
        // Wrap it with an UnmodifiableMap
        UnmodifiableMap<String, String> unmodifiableMap = UnmodifiableMap.unmodifiableMap(modifiableMap);

        // Since UnmodifiableMap does not support put operation directly, we put into the original map
        /* write */ modifiableMap.put("key", "value");
        
        // Read the value from the unmodifiable map
        /* read */ String value = unmodifiableMap.get("key");
        
        System.out.println(value);
    }
}