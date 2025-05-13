import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a CacheLoader that loads values based on keys
        CacheLoader<String, String> loader = new CacheLoader<>() {
            @Override
            public String load(String key) {
                return "Value for " + key;
            }
        };

        // Build the cache using CacheBuilder and the loader
        /* write */ LoadingCache<String, String> cache = CacheBuilder.newBuilder().build(loader);

        // Put a value in the cache
        cache.put("key1", "value1");

        // Create a HashMap to store additional data
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("item1", 100);
        dataMap.put("item2", 200);
        dataMap.put("item3", 300);

        // Iterate over the HashMap and perform some operations
        int total = 0;
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            total += entry.getValue();
            System.out.println("Processing " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total: " + total);

        try {
            // Read the value from the cache using the key
            /* read */ String value = cache.get("key1");
            System.out.println("Cache retrieved: " + value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // Create another CacheLoader and CacheBuilder for a different cache
        CacheLoader<Integer, String> anotherLoader = new CacheLoader<>() {
            @Override
            public String load(Integer key) {
                return "Number " + key;
            }
        };

        // Build another cache
        Cache<Integer, String> anotherCache = CacheBuilder.newBuilder().build(anotherLoader);

        // Put values in the new cache
        anotherCache.put(1, "one");
        anotherCache.put(2, "two");
        anotherCache.put(3, "three");

        // Read from the new cache
        try {
            String numberValue = anotherCache.get(2);
            System.out.println("Another cache retrieved: " + numberValue);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}