import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("key", 42); // Initial value to ensure the map is not empty
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(originalMap);
        
        // Since UnmodifiableMap does not allow modifications, we cannot directly use `put` on it.
        // Therefore, we simulate the write operation by modifying the original map and recreating the UnmodifiableMap.

        /* write */ originalMap.put("key", 100); // Simulate the write operation
        unmodifiableMap = UnmodifiableMap.unmodifiableMap(originalMap); // Recreate the unmodifiable map

        /* read */ int value = unmodifiableMap.get("key");
        System.out.println(value);
    }
}