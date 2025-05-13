import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Create a LoadingCache instance
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, Integer>() {
                    public Integer load(String key) {
                        return null; // Default implementation, won't be used
                    }
                });

        // Use the write method to put a value into the cache
        /* write */ cache.put("key", 42);

        try {
            // Use the read method to get the value from the cache
            /* read */ int value = cache.get("key");
            System.out.println(value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}