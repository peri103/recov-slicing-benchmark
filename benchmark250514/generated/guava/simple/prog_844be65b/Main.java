import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader.InvalidCacheLoadException;

public class Main {
    public static void main(String[] args) {
        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, String>() {
                    public String load(String key) {
                        return "default";
                    }
                });

        /* write */ cache.put("key", "value");
        try {
            /* read */ String value = cache.get("key");
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}