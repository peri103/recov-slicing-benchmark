import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a FixedSizeMap with a fixed size
        HashMap<String, Integer> baseMap = new HashMap<>();
        baseMap.put("key1", null); // Initialize with null values to ensure fixed size
        FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(baseMap);

        /* write */ fixedSizeMap.put("key1", 42);

        /* read */ Integer value = fixedSizeMap.get("key1");
        System.out.println(value);
    }
}