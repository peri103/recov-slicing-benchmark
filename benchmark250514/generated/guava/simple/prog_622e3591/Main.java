import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Initialize the LoadingCache
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .maximumSize(100)
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return null; // Default behavior for cache miss
                }
            });

        // Use the write method to put a value in the cache
        /* write */ cache.put("key1", 100);

        try {
            // Use the read method to get the value from the cache
            /* read */ int value = cache.get("key1");
            System.out.println(value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}