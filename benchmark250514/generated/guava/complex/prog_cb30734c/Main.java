import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a LoadingCache with a simple CacheLoader
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, Integer>() {
                    public Integer load(String key) {
                        return -1; // Default value if the key is not present
                    }
                });

        // Create another LoadingCache for demonstration
        LoadingCache<String, String> stringCache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, String>() {
                    public String load(String key) {
                        return "default"; // Default value if the key is not present
                    }
                });

        // Use the write method to put a value in the cache
        /* write */ cache.put("key1", 100);

        // Use the write method on the second cache
        stringCache.put("greeting", "Hello, World!");

        // Create a HashMap for additional complexity
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        // Perform operations on the HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        try {
            // Use the read method to get the value from the cache
            /* read */ int value = cache.get("key1");
            System.out.println("Read from cache: " + value);

            // Read from the second cache
            String greeting = stringCache.get("greeting");
            System.out.println("Greeting: " + greeting);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // Further operations for complexity
        map.put("three", 3);
        int sum = 0;
        for (Integer val : map.values()) {
            sum += val;
        }
        System.out.println("Sum of values in map: " + sum);
    }
}