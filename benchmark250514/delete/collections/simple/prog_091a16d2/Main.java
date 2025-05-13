import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 42); // Initial write to the HashMap

        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(map);

        /* read */ int value = unmodifiableMap.get("key");
        System.out.println(value);
    }
}