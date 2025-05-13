import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CacheManager {
    private LoadingCache<String, Integer> cache;

    public CacheManager() {
        cache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, Integer>() {
                    public Integer load(String key) {
                        return null; // Default implementation, won't be used
                    }
                });
    }

    public void putValue(String key, Integer value) {
        /* write */ cache.put(key, value);
    }

    public Integer getValue(String key) throws Exception {
        return cache.get(key);
    }
}