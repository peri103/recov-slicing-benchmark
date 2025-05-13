import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, List<Integer>> map = new HashMap<>();
        
        // Additional operations with HashMap
        map.put("extraKey", List.of(100, 200, 300));
        System.out.println("Map values for 'extraKey': " + map.get("extraKey"));
        
        // Operations with Multimap
        multimap.put("anotherKey", 56);
        multimap.put("anotherKey", 78);
        System.out.println("Multimap values for 'anotherKey': " + multimap.get("anotherKey"));
        
        // More complex operations
        for (String key : map.keySet()) {
            List<Integer> values = map.get(key);
            for (Integer val : values) {
                multimap.put(key, val);
            }
        }
        
        // Print all values in the multimap
        for (String key : multimap.keySet()) {
            System.out.println("Multimap key: " + key + ", values: " + multimap.get(key));
        }
        
        /* write */ multimap.put("key", 42);
        
        // Perform additional operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Perform operations on the map
        map.put("sumKey", List.of(sum));
        System.out.println("Map values for 'sumKey': " + map.get("sumKey"));
        
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println(value);
        
        // Additional operations after read
        List<Integer> extraValues = map.get("extraKey");
        if (extraValues != null) {
            for (Integer extraValue : extraValues) {
                System.out.println("Extra value: " + extraValue);
            }
        }
    }
}