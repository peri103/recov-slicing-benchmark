import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Create a cache using CacheBuilder
        Cache<String, Integer> cache = CacheBuilder.newBuilder()
                .maximumSize(100)
                .build(); // /* write */

        // Prepopulate the cache with a value
        String key = "exampleKey";
        Integer valueToWrite = 42;
        cache.put(key, valueToWrite);

        // Read the value back from the cache
        Integer valueRead = null;
        try {
            valueRead = cache.get(key, () -> null); // /* read */
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // Output the value read from the cache
        System.out.println(valueRead);
    }
}