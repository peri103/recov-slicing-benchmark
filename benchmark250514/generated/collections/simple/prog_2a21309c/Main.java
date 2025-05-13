import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        LazyMap<String, Integer> lazyMap = LazyMap.lazyMap(map, () -> 0);
        
        /* write */ lazyMap.put("key", 42);
        /* read */ int value = lazyMap.get("key");
        
        System.out.println(value);
    }
}