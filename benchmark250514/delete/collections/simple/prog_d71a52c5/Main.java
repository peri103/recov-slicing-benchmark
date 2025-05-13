import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(hashMap);

        /* write */ hashMap.put("key", 42);

        /* read */ int value = unmodifiableMap.get("key");
        System.out.println(value);
    }
}