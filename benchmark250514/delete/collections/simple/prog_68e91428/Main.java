import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(originalMap);
        
        // Since UnmodifiableMap does not allow direct modifications, we need to modify the original map
        /* write */ originalMap.put("key", 42);
        
        // Reading from the unmodifiable map
        /* read */ Integer value = unmodifiableMap.get("key");
        
        System.out.println(value);
    }
}