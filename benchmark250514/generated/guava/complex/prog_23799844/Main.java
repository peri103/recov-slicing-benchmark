import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.Cache;
import java.util.concurrent.ExecutionException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a LoadingCache with a simple CacheLoader
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, Integer>() {
                    public Integer load(String key) {
                        return null; // Default behavior if key is not present
                    }
                });

        // Create a HashMap for additional complexity
        Map<String, String> map = new HashMap<>();
        map.put("one", "apple");
        map.put("two", "banana");
        map.put("three", "cherry");

        // Iterate over the map and print entries
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);

        /* write */ cache.put("key1", 100);

        // Another cache for complexity
        LoadingCache<String, String> stringCache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, String>() {
                    public String load(String key) {
                        return "default"; // Default behavior if key is not present
                    }
                });

        stringCache.put("greet", "Hello");
        stringCache.put("farewell", "Goodbye");

        try {
            String greeting = stringCache.get("greet");
            System.out.println(greeting);

            /* read */ int value = cache.get("key1");
            System.out.println(value);
            
            String farewell = stringCache.get("farewell");
            System.out.println(farewell);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // More calculations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 natural numbers: " + product);
    }
}