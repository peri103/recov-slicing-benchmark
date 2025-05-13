import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Create a CacheLoader to load values into the cache
        CacheLoader<String, String> loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) throws Exception {
                return "Value for " + key;
            }
        };

        // Use CacheBuilder to build a LoadingCache instance
        /* write */ LoadingCache<String, String> cache = CacheBuilder.newBuilder().build(loader);

        // Write a value into the cache
        cache.put("key1", "value1");

        try {
            // Read the value from the cache
            /* read */ String value = cache.get("key1");
            System.out.println(value);
        } catch (ExecutionException e) {
            System.err.println("Error loading value from cache: " + e.getMessage());
        } catch (InvalidCacheLoadException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}