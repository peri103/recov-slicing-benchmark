import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        baseMap.put("key", 0); // Initialize base map with a key to ensure fixed size map has a valid key
        FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(baseMap);

        /* write */ fixedSizeMap.put("key", 42);
        /* read */ Integer value = fixedSizeMap.get("key");

        System.out.println(value);
    }
}