import com.google.common.collect.ArrayListMultimap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, List<Integer>> map = new HashMap<>();
        
        // Adding some initial data to the map
        map.put("key2", List.of(200, 300));
        map.put("key3", List.of(400, 500));
        
        // Perform some operations on the map
        for (String key : map.keySet()) {
            List<Integer> values = map.get(key);
            for (Integer value : values) {
                System.out.println("Map value for " + key + ": " + value);
            }
        }
        
        /* write */ multimap.put("key1", 100);
        
        // Additional operations on multimap
        multimap.put("key2", 200);
        multimap.put("key3", 300);
        
        for (String key : multimap.keySet()) {
            List<Integer> values = multimap.get(key);
            System.out.println("Multimap values for " + key + ": " + values);
        }
        
        // Some unrelated complex operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        System.out.println("Sum of first 5 multiples of 10: " + sum);
        
        /* read */ List<Integer> values = multimap.get("key1");
        System.out.println(values.get(0));
        
        // Further processing
        int total = 0;
        for (Integer value : values) {
            total += value;
        }
        System.out.println("Total of values from multimap key1: " + total);
    }
}