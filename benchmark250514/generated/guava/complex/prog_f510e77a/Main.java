import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a cache instance
        Cache<String, Integer> cache = CacheBuilder.newBuilder().build();

        // Create a map to store additional data
        Map<String, String> map = new HashMap<>();
        map.put("name", "John Doe");
        map.put("occupation", "Software Developer");

        // Perform some operations on the map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Write a value to the cache
        /* write */ cache.put("key", 42);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Create another cache instance for demonstration
        Cache<String, String> stringCache = CacheBuilder.newBuilder().build();
        stringCache.put("greeting", "Hello, World!");

        // Read a value from the string cache
        String greeting = stringCache.getIfPresent("greeting");
        System.out.println(greeting);

        // Read the value from the original cache
        /* read */ Integer value = cache.getIfPresent("key");

        // Print the value
        System.out.println(value);
    }
}