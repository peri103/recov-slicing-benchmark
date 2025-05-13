import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.Cache;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Create a LoadingCache with a simple CacheLoader
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .build(new CacheLoader<String, Integer>() {
                    public Integer load(String key) {
                        return null; // Default behavior if key is not present
                    }
                });

        /* write */ cache.put("key1", 100);

        try {
            /* read */ int value = cache.get("key1");
            System.out.println(value);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}