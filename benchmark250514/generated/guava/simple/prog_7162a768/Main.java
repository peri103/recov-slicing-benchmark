import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Create a LoadingCache instance
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return 0; // Default value if not found
                }
            });

        // Write a value to the cache
        /* write */ cache.put("key", 42);

        try {
            // Read the value from the cache
            /* read */ Integer value = cache.get("key");
            System.out.println(value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}