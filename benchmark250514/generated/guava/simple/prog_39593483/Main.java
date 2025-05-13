import com.google.common.cache.CacheBuilder;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

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

        // Read from the cache
        try {
            /* read */ int value = cache.get("key1");
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}