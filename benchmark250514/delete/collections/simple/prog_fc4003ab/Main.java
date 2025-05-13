import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> modifiableMap = new HashMap<>();
        UnmodifiableMap<String, String> map = UnmodifiableMap.unmodifiableMap(modifiableMap);

        // Since UnmodifiableMap does not support modification, we modify the original map
        /* write */ modifiableMap.put("key", "value");

        // Reading from the unmodifiable map should reflect the changes in the original map
        /* read */ String value = map.get("key");
        System.out.println(value);
    }
}