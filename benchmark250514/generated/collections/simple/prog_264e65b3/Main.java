import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        baseMap.put("key1", 0);
        FixedSizeMap<String, Integer> map = FixedSizeMap.fixedSizeMap(baseMap);
        
        /* write */ map.put("key1", 42);
        
        /* read */ int value = map.get("key1");
        System.out.println(value);
    }
}