import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> baseMap = new HashMap<>();
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(baseMap);

        // Since UnmodifiableMap does not support modification, we use the base map for writing
        /* write */ baseMap.put("key", 42);

        // Read from the unmodifiable map
        /* read */ Integer value = unmodifiableMap.get("key");
        System.out.println(value);
    }
}