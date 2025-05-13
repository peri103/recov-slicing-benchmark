import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class Main {
    public static void main(String[] args) {
        Cache<String, Integer> cache = CacheBuilder.newBuilder().build();
        
        /* write */ cache.put("key", 42);
        
        /* read */ Integer value = cache.get("key", () -> null);
        
        System.out.println(value);
    }
}