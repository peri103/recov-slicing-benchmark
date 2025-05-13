import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cache<String, Integer> cache = CacheBuilder.newBuilder().build();
        Map<String, Integer> map = new HashMap<>();
        
        map.put("anotherKey", 100);
        map.put("yetAnotherKey", 200);

        /* write */ cache.put("key", 42);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            cache.put(entry.getKey(), entry.getValue());
        }
        
        Integer anotherValue = cache.getIfPresent("anotherKey");
        if (anotherValue != null) {
            System.out.println("Value from map: " + anotherValue);
        }

        Integer yetAnotherValue = cache.getIfPresent("yetAnotherKey");
        if (yetAnotherValue != null) {
            System.out.println("Value from map: " + yetAnotherValue);
        }

        for (String key : map.keySet()) {
            System.out.println("Map contains: " + key + " -> " + map.get(key));
        }
        
        /* read */ Integer value = cache.get("key", () -> null);
        
        System.out.println("Value from cache: " + value);
    }
}