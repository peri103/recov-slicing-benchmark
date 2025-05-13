import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        UnmodifiableMap<String, Integer> map = UnmodifiableMap.unmodifiableMap(originalMap);
        
        /* write */ originalMap.put("key", 42);
        
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}