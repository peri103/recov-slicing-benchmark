import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;

public class Main {
    public static void main(String[] args) {
        // Create a LoadingCache instance
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return null; // Default behavior for non-existing keys
                }
            });

        // Use the write method to put a value into the cache
        /* write */ cache.put("key1", 100);

        // Use the read method to get the value from the cache
        try {
            /* read */ int value = cache.get("key1");
            System.out.println(value);
        } catch (InvalidCacheLoadException e) {
            System.out.println("Value not found in cache.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}