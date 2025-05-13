import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.Cache;

public class Main {
    public static void main(String[] args) {
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return null; // Default behavior, not used in this example
                }
            });

        /* write */ cache.put("key1", 42);
        try {
            /* read */ int value = cache.get("key1");
            System.out.println(value);
        } catch (Exception e) {
            System.err.println("Error reading from cache: " + e.getMessage());
        }
    }
}