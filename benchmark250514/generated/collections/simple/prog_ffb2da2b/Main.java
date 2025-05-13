import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> initialMap = new HashMap<>();
        initialMap.put("key1", 0); // Initialize with default values to ensure fixed size
        FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(initialMap);

        /* write */ fixedSizeMap.put("key1", 42);
        /* read */ int value = fixedSizeMap.get("key1");
        
        System.out.println(value);
    }
}