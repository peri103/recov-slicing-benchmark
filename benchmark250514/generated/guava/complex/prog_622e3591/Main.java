import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the LoadingCache
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .maximumSize(100)
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return null; // Default behavior for cache miss
                }
            });

        // Initialize another cache with a different configuration
        LoadingCache<String, String> stringCache = CacheBuilder.newBuilder()
            .maximumSize(50)
            .build(new CacheLoader<String, String>() {
                public String load(String key) {
                    return "default"; // Default behavior for cache miss
                }
            });

        // Use the write method to put a value in the cache
        /* write */ cache.put("key1", 100);

        // Use the second cache to store some values
        stringCache.put("keyA", "Hello");
        stringCache.put("keyB", "World");

        // Initialize a HashMap to store additional data
        HashMap<String, Double> dataMap = new HashMap<>();
        dataMap.put("value1", 1.1);
        dataMap.put("value2", 2.2);

        // Perform operations on the HashMap
        double sum = 0;
        for (Double value : dataMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in dataMap: " + sum);

        try {
            // Use the read method to get the value from the cache
            /* read */ int value = cache.get("key1");
            System.out.println("Value from cache: " + value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // Retrieve values from the second cache
        try {
            String greeting = stringCache.get("keyA");
            String target = stringCache.get("keyB");
            System.out.println(greeting + " " + target);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // Perform additional operations
        for (int i = 0; i < 5; i++) {
            dataMap.put("value" + (i + 3), i * 1.5);
        }
        for (String key : dataMap.keySet()) {
            System.out.println(key + ": " + dataMap.get(key));
        }
    }
}