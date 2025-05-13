import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class Main {
    public static void main(String[] args) {
        Cache<Integer, String> cache = CacheBuilder.newBuilder().build();
        /* write */ cache.put(1, "Hello, World!");
        /* read */ String value = cache.getIfPresent(1);
        System.out.println(value);
    }
}