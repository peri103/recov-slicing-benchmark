import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the cache
        Cache<Integer, String> cache = CacheBuilder.newBuilder().build();

        // Initialize a HashMap for additional complexity
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Goodbye, World!");
        
        // Perform additional operations on the map
        for (int i = 3; i <= 5; i++) {
            map.put(i, "Value " + i);
        }

        // Write to the cache
        /* write */ cache.put(1, "Hello, World!");

        // Perform operations on the map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Map Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Read from the cache
        /* read */ String value = cache.getIfPresent(1);
        System.out.println(value);

        // More operations on the map
        map.put(6, "Another Value");
        for (int i = 2; i <= 6; i++) {
            System.out.println("Updated Map Key: " + i + ", Value: " + map.get(i));
        }

        // Final operations
        System.out.println("Cache contains key 1: " + (cache.getIfPresent(1) != null));
        System.out.println("Map size: " + map.size());
    }
}