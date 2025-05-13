import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Create a CacheLoader that loads values based on keys
        CacheLoader<String, String> loader = new CacheLoader<>() {
            @Override
            public String load(String key) {
                return "Value for " + key;
            }
        };

        // Build the cache using CacheBuilder and the loader
        /* write */ LoadingCache<String, String> cache = CacheBuilder.newBuilder().build(loader);

        // Put a value in the cache
        cache.put("key1", "value1");

        try {
            // Read the value from the cache using the key
            /* read */ String value = cache.get("key1");
            System.out.println(value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}