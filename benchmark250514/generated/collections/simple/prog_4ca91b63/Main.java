import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        FixedSizeMap<String, Integer> map = FixedSizeMap.fixedSizeMap(baseMap);
        
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}