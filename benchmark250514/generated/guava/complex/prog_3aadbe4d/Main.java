import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader;
import java.util.concurrent.ExecutionException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .maximumSize(100)
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return -1; // default value if key not found
                }
            });
        
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");

        /* write */ cache.put("key1", 42);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        try {
            for (String key : map.keySet()) {
                System.out.println("Map value: " + map.get(key));
            }
            /* read */ int value = cache.get("key1");
            System.out.println("Cache value: " + value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        LoadingCache<String, String> stringCache = CacheBuilder.newBuilder()
            .maximumSize(50)
            .build(new CacheLoader<String, String>() {
                public String load(String key) {
                    return "Unknown"; // default value if key not found
                }
            });

        stringCache.put("fruit", "Mango");
        
        try {
            String fruitValue = stringCache.get("fruit");
            System.out.println("String Cache value: " + fruitValue);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}