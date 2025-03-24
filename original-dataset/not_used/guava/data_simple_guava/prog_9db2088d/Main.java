import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class Main {
    public static void main(String[] args) {
        // Build a cache instance
        Cache<Integer, String> cache = CacheBuilder.newBuilder().build();
        
        // Write to the cache
        /* write */ cache.put(1, "Hello, World!");

        // Read from the cache
        /* read */ String value = cache.getIfPresent(1);
        
        // Print the value
        System.out.println(value);
    }
}