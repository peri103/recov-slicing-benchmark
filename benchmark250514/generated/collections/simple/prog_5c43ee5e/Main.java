import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(baseMap);
        
        /* write */ fixedSizeMap.put("key", 42);
        
        /* read */ int value = fixedSizeMap.get("key");
        
        System.out.println(value);
    }
}