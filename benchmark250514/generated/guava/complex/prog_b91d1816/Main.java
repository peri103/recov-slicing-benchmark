import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, Integer> simpleMap = new HashMap<>();
        
        // Adding values to the simpleMap
        simpleMap.put("alpha", 10);
        simpleMap.put("beta", 20);
        
        // Iterating over the simpleMap and adding its values to multimap
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            multimap.put(entry.getKey(), entry.getValue() + 5);
        }
        
        /* write */ multimap.put("key", 42);
        
        // Performing some operations on the multimap
        for (String key : multimap.keySet()) {
            List<Integer> values = multimap.get(key);
            for (Integer value : values) {
                System.out.println("Processing value: " + value);
            }
        }
        
        // Adding more values to the multimap
        multimap.put("gamma", 30);
        multimap.put("delta", 40);
        
        // More complex operations
        int sum = 0;
        for (String key : multimap.keySet()) {
            List<Integer> values = multimap.get(key);
            for (Integer value : values) {
                sum += value;
            }
        }
        
        System.out.println("Total sum of values: " + sum);
        
        /* read */ List<Integer> values = multimap.get("key");
        System.out.println("Values for 'key': " + values);
        
        // Adding some more complexity
        for (int i = 0; i < 5; i++) {
            multimap.put("extra", i * 2);
        }
        
        // Print all values in multimap
        for (String key : multimap.keySet()) {
            List<Integer> allValues = multimap.get(key);
            System.out.println("All values for '" + key + "': " + allValues);
        }
    }
}