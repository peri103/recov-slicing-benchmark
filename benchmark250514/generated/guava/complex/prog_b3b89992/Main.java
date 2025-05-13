import com.google.common.collect.LinkedHashMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        
        // Adding elements to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Iterating over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Using the multimap
        multimap.put("key1", "value1");
        multimap.put("key2", "value2");
        multimap.put("key3", "value3");
        
        // Manipulating map
        map.put("four", 4);
        map.remove("two");
        
        // Performing some operations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);
        
        // Original write-read pair
        /* write */ multimap.put("key", "value");
        
        // More operations unrelated to multimap
        map.put("five", 5);
        map.put("six", 6);
        
        for (String key : map.keySet()) {
            System.out.println(key + " exists in map.");
        }
        
        // Reading from the multimap
        /* read */ java.util.Collection<String> values = multimap.get("key");
        for (String value : values) {
            System.out.println(value);
        }
        
        // Additional computations
        int product = 1;
        for (Integer value : map.values()) {
            product *= value;
        }
        System.out.println("Product of map values: " + product);
    }
}