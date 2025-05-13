import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a mutable map to use with UnmodifiableMap
        Map<String, Integer> mutableMap = new HashMap<>();
        mutableMap.put("key", 42); // Adding an initial value to the mutable map

        // Create an unmodifiable map from the mutable map
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(mutableMap);

        // Attempt to write using put method
        // Since UnmodifiableMap does not allow direct modification, we will modify the original map
        /* write */ mutableMap.put("newKey", 100);

        // Read the value using the get method
        /* read */ int value = unmodifiableMap.get("newKey");

        // Output the read value
        System.out.println(value);
    }
}