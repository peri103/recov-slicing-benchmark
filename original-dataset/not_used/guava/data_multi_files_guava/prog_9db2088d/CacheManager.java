import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class CacheManager {
    private Cache<Integer, String> cache;

    public CacheManager() {
        cache = CacheBuilder.newBuilder().build();
    }

    public void addValue(int key, String value) {
        /* write */ cache.put(key, value);
    }

    public String getValue(int key) {
        return cache.getIfPresent(key);
    }
}
