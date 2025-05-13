import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class Main {
    public static void main(String[] args) {
        // Initialize the Cache using CacheBuilder
        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) {
                        return "default";
                    }
                });
        
        // Write a value to the cache
        /* write */ cache.put("key1", "value1");
        
        // Read the value from the cache
        try {
            /* read */ String value = cache.get("key1");
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}