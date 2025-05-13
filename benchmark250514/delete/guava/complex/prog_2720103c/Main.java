import com.google.common.collect.ArrayListMultimap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        
        // Unrelated operations with HashMap
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in map: " + sum);

        // Operations with multimap
        multimap.put("anotherKey", 100);
        multimap.put("anotherKey", 200);
        
        // Complex operations
        List<Integer> anotherValues = multimap.get("anotherKey");
        for (Integer val : anotherValues) {
            System.out.println("Value from anotherKey: " + val);
        }

        // Continue with unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);

        // Original write-read pair
        /* write */ multimap.put("key", 42);
        
        // More unrelated operations
        List<String> keys = new ArrayList<>();
        keys.add("X");
        keys.add("Y");
        keys.add("Z");
        for (String key : keys) {
            map.put(key, key.length());
        }
        System.out.println("Keys and their lengths: " + map);

        // Original read operation
        /* read */ List<Integer> values = multimap.get("key");
        System.out.println(values);
    }
}