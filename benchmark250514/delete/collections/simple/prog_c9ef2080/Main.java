import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap to wrap with UnmodifiableMap
        HashMap<String, String> baseMap = new HashMap<>();
        
        // Wrap the HashMap with UnmodifiableMap
        UnmodifiableMap<String, String> unmodifiableMap = UnmodifiableMap.unmodifiableMap(baseMap);
        
        /* write */ baseMap.put("key", "value"); // Directly modify the base map
        
        /* read */ String readValue = unmodifiableMap.get("key");
        System.out.println(readValue);
    }
}