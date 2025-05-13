import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;
import java.util.concurrent.ExecutionException;

public class CacheManager {
    private LoadingCache<String, String> cache;

    public CacheManager() {
        cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<String, String>() {
                @Override
                public String load(String key) {
                    return null; // Default behavior for missing keys
                }
            });
    }

    public void putValue(String key, String value) {
        /* write */ cache.put(key, value);
    }

    public String getValue(String key) {
        try {
            /* read */ return cache.get(key);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InvalidCacheLoadException e) {
            System.out.println("Key not found in cache.");
        }
        return null;
    }
}
