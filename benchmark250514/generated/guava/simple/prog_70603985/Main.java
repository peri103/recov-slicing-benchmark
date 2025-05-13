import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.Cache;

public class Main {
    public static void main(String[] args) {
        // Initialize the LoadingCache with a simple CacheLoader
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return null; // Default behavior for missing keys
                }
            });

        // Write to the cache
        /* write */ cache.put("key", 42);

        // Read from the cache
        try {
            /* read */ int value = cache.get("key");
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}