import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class Main {
    public static void main(String[] args) {
        // Create a LoadingCache instance
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, Integer>() {
                    public Integer load(String key) {
                        return null; // Default loading behavior, not used in this example
                    }
                });

        // Write to the cache
        /* write */ cache.put("key1", 42);

        // Read from the cache
        try {
            /* read */ int value = cache.get("key1");
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("Error reading from cache: " + e.getMessage());
        }
    }
}