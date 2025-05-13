import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.Cache;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return null; // Default behavior, not used in this example
                }
            });

        Map<String, Integer> map = new HashMap<>();
        map.put("alpha", 100);
        map.put("beta", 200);

        /* write */ cache.put("key1", 42);

        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in map: " + sum);

        try {
            /* read */ int value = cache.get("key1");
            System.out.println("Value from cache: " + value);
        } catch (Exception e) {
            System.err.println("Error reading from cache: " + e.getMessage());
        }

        map.put("gamma", 300);
        int product = 1;
        for (Integer val : map.values()) {
            product *= val;
        }
        System.out.println("Product of values in map: " + product);

        int maxValue = Integer.MIN_VALUE;
        for (Integer val : map.values()) {
            if (val > maxValue) {
                maxValue = val;
            }
        }
        System.out.println("Max value in map: " + maxValue);
    }
}