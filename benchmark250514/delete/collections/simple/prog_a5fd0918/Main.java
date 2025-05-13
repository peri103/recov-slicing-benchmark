import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        UnmodifiableMap<String, Integer> unmodifiableMap = new UnmodifiableMap<>(hashMap);

        // Since UnmodifiableMap does not allow modification, we need to put the value in the original map
        /* write */ hashMap.put("key", 100);

        // Read the value using the UnmodifiableMap
        /* read */ int value = unmodifiableMap.get("key");
        System.out.println(value);
    }
}