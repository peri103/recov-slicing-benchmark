import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SetMultimap<String, Integer> multimap = HashMultimap.create();
        Map<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("first", 10);
        map.put("second", 20);
        map.put("third", 30);

        // Iterating over the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ multimap.put("key", 42);

        // Adding more elements to the multimap
        multimap.put("anotherKey", 100);
        multimap.put("key", 43);
        multimap.put("key", 44);

        // Perform some operations before reading
        for (String key : multimap.keySet()) {
            System.out.println("Multimap Key: " + key + ", Values: " + multimap.get(key));
        }

        /* read */ Set<Integer> values = multimap.get("key");
        System.out.println(values);

        // Additional complex operations
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        // Further operations with the HashMap
        map.put("fourth", sum);
        System.out.println("Updated HashMap: " + map);
    }
}