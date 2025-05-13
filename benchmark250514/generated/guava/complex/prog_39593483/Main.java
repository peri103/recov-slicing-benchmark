import com.google.common.cache.CacheBuilder;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a cache with CacheBuilder
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .maximumSize(100)
            .removalListener(new RemovalListener<String, Integer>() {
                @Override
                public void onRemoval(RemovalNotification<String, Integer> notification) {
                    System.out.println("Removed: " + notification.getKey() + ", " + notification.getValue());
                }
            })
            .build(new CacheLoader<String, Integer>() {
                @Override
                public Integer load(String key) throws Exception {
                    return 0;
                }
            });

        // Write to the cache
        /* write */ cache.put("key1", 42);

        // Additional code using HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Alice");
        map.put("city", "Wonderland");

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // More complex logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read from the cache
        try {
            /* read */ int value = cache.get("key1");
            System.out.println("Cached value: " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Further operations
        map.put("occupation", "Explorer");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}