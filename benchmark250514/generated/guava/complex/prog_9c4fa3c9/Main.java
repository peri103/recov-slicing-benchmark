import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = LinkedHashMultimap.create();
        Map<String, Integer> map = new HashMap<>();

        /* write */ multimap.put("key1", "value1");

        // Adding some unrelated operations
        map.put("alpha", 1);
        map.put("beta", 2);
        map.put("gamma", 3);

        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in map: " + sum);

        // Adding more entries to the multimap
        multimap.put("key2", "value2");
        multimap.put("key3", "value3");

        // Iterating over multimap entries
        for (String key : multimap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + multimap.get(key));
        }

        // Performing some calculations
        int product = 1;
        for (int value : map.values()) {
            product *= value;
        }
        System.out.println("Product of values in map: " + product);

        // Retrieving the original value
        /* read */ String value = multimap.get("key1").iterator().next();
        System.out.println(value);

        // Adding more unrelated operations
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("a", "apple");
        stringMap.put("b", "banana");
        stringMap.put("c", "cherry");

        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Fruit: " + entry.getValue());
        }
    }
}