import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cache<String, Integer> cache = CacheBuilder.newBuilder().build();
        
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");

        /* write */ cache.put("key", 42);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        /* read */ Integer value = cache.getIfPresent("key");

        if (value != null) {
            System.out.println("Cache value for 'key': " + value);
        } else {
            System.out.println("No value found in cache for 'key'");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Square of " + i + " is " + (i * i));
        }

        Map<Integer, String> numberMap = new HashMap<>();
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        numberMap.put(3, "Three");

        for (Map.Entry<Integer, String> entry : numberMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Word: " + entry.getValue());
        }
    }
}