import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a LoadingCache instance
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return null; // Default behavior for non-existing keys
                }
            });

        // Create a HashMap for additional complexity
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key2", 200);
        map.put("key3", 300);

        // Perform operations on HashMap
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of values in map: " + sum);

        // Use the write method to put a value into the cache
        /* write */ cache.put("key1", 100);

        // Perform more operations before reading from the cache
        int product = 1;
        for (Integer value : map.values()) {
            product *= value;
        }
        System.out.println("Product of values in map: " + product);

        // Use the read method to get the value from the cache
        try {
            /* read */ int value = cache.get("key1");
            System.out.println("Value from cache: " + value);
        } catch (InvalidCacheLoadException e) {
            System.out.println("Value not found in cache.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Additional operations after reading from cache
        map.put("key4", 400);
        map.put("key5", 500);
        int total = 0;
        for (Integer value : map.values()) {
            total += value;
        }
        System.out.println("Total of all values in map: " + total);
    }
}