import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Create a CacheLoader to provide default values when keys are not present
        CacheLoader<String, Integer> loader = new CacheLoader<>() {
            public Integer load(String key) {
                return null; // Return null for missing keys
            }
        };

        // Initialize the LoadingCache with the CacheLoader
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .build(loader);

        // Write a value to the cache
        /* write */ cache.put("key1", 123);

        // Read the value from the cache
        try {
            /* read */ Integer value = cache.get("key1");
            System.out.println(value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}