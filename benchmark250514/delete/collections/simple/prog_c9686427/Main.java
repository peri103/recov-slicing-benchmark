import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap to be wrapped by UnmodifiableMap
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Wrap the HashMap with UnmodifiableMap
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(hashMap);
        
        // Since UnmodifiableMap does not support modification, we need to put the value into the HashMap directly
        /* write */ hashMap.put("key", 42);
        
        // Read the value using UnmodifiableMap's get method
        /* read */ Integer value = unmodifiableMap.get("key");
        
        // Print the value
        System.out.println(value);
    }
}