import com.google.common.collect.ArrayListMultimap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, Integer> map = new HashMap<>();

        // Populating the map with some data
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // Adding more entries to the multimap
        multimap.put("alpha", 100);
        multimap.put("beta", 200);
        
        /* write */ multimap.put("key", 42);

        // Performing some operations with the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of map values: " + sum);

        // Adding more entries to the multimap
        multimap.put("gamma", 300);
        multimap.put("delta", 400);

        // Performing some operations with the multimap
        List<Integer> alphaValues = multimap.get("alpha");
        for (Integer value : alphaValues) {
            System.out.println("Alpha value: " + value);
        }

        // More unrelated code to increase complexity
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println("Map key: " + key + ", value: " + value);
        }

        // Final reading of the original write-read pair
        /* read */ List<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}