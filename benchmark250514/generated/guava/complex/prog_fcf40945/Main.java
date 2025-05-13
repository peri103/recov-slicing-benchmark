import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, String> map = new HashMap<>();

        map.put("hello", "world");
        map.put("foo", "bar");

        // Some unrelated operations with map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* write */ multimap.put("key", 42);

        // More operations with map
        map.put("newKey", "newValue");
        if (map.containsKey("foo")) {
            System.out.println("Map contains key 'foo'");
        }

        // Another unrelated operation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Yet another unrelated operation
        if (map.containsValue("world")) {
            System.out.println("Map contains value 'world'");
        }

        // Complex logic involving multimap
        for (String key : multimap.keySet()) {
            for (Integer val : multimap.get(key)) {
                System.out.println("Multimap contains: " + key + " -> " + val);
            }
        }

        /* read */ Integer value = multimap.get("key").get(0);
        System.out.println("Read value from multimap: " + value);

        // Final operation
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}