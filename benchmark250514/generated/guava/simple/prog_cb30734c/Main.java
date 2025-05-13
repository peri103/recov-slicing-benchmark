import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Create a LoadingCache with a simple CacheLoader
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, Integer>() {
                    public Integer load(String key) {
                        return -1; // Default value if the key is not present
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