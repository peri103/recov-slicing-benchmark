import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> modifiableMap = new HashMap<>();
        UnmodifiableMap<String, Integer> map = UnmodifiableMap.unmodifiableMap(modifiableMap);
        
        /* write */ modifiableMap.put("key1", 100);
        
        /* read */ int value = map.get("key1");
        System.out.println(value);
    }
}