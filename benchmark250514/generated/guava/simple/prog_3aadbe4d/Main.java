import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
            .maximumSize(100)
            .build(new CacheLoader<String, Integer>() {
                public Integer load(String key) {
                    return -1; // default value if key not found
                }
            });

        /* write */ cache.put("key1", 42);
        
        try {
            /* read */ int value = cache.get("key1");
            System.out.println(value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}