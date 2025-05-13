import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LazyMap<String, Integer> lazyMap = LazyMap.lazyMap(hashMap, () -> 0);

        /* write */ lazyMap.put("key", 42);
        /* read */ Integer value = lazyMap.get("key");
        
        System.out.println(value);
    }
}