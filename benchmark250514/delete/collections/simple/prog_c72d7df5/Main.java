import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a modifiable map
        Map<String, Integer> modifiableMap = new HashMap<>();
        
        // Wrapping the modifiable map with UnmodifiableMap
        UnmodifiableMap<String, Integer> map = new UnmodifiableMap<>(modifiableMap);
        
        // Adding an entry to the modifiable map before wrapping it
        modifiableMap.put("key", 42);
        
        // Attempting to write using the UnmodifiableMap will throw an UnsupportedOperationException
        // Hence, we add to the original modifiable map
        /* write */ modifiableMap.put("key", 42);
        
        // Reading the value using UnmodifiableMap
        /* read */ Integer value = map.get("key");
        
        // Output the read value
        System.out.println(value);
    }
}