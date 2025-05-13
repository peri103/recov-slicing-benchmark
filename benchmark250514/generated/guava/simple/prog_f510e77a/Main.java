import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class Main {
    public static void main(String[] args) {
        // Create a cache instance
        Cache<String, Integer> cache = CacheBuilder.newBuilder().build();

        // Write a value to the cache
        /* write */ cache.put("key", 42);

        // Read the value from the cache
        /* read */ Integer value = cache.getIfPresent("key");

        // Print the value
        System.out.println(value);
    }
}