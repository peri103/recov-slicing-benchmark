import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable map
        Map<String, Integer> modifiableMap = new HashMap<>();

        // Wrap the modifiable map with UnmodifiableMap
        UnmodifiableMap<String, Integer> map = UnmodifiableMap.unmodifiableMap(modifiableMap);

        // Since UnmodifiableMap does not allow direct modification,
        // we modify the underlying modifiable map directly
        modifiableMap.put("key", 42); // Equivalent to /* write */

        // Read the value using the unmodifiable map
        Integer value = map.get("key"); // Equivalent to /* read */

        System.out.println(value);
    }
}