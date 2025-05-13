import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import com.google.common.cache.CacheStats;

public class Main {
    public static void main(String[] args) {
        // Create a CacheLoader
        CacheLoader<String, String> loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) {
                return "Value for " + key;
            }
        };

        // Build the cache
        /* write */ LoadingCache<String, String> cache = CacheBuilder.newBuilder().build(loader);

        // Write a value to the cache
        String key = "exampleKey";
        cache.put(key, "exampleValue");

        // Read the value from the cache
        try {
            /* read */ String value = cache.get(key);
            System.out.println("Read value: " + value);
        } catch (InvalidCacheLoadException e) {
            System.out.println("Error reading from cache: " + e.getMessage());
        }
    }
}