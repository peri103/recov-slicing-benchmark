import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;

public class Main {
    public static void main(String[] args) {
        // Initialize the cache with a CacheLoader
        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<String, String>() {
                public String load(String key) {
                    return null; // Return null for keys not explicitly put
                }
            });

        // Use the write method to put a value in the cache
        /* write */ cache.put("key", "value");

        try {
            // Use the read method to get the value from the cache
            /* read */ String value = cache.get("key");
            System.out.println(value);
        } catch (InvalidCacheLoadException e) {
            System.out.println("Value not found in cache.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}