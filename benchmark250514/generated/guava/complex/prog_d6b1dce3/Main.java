import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = HashMultimap.create();
        Map<String, Integer> hashmap = new HashMap<>();
        
        // Adding elements to the HashMap
        hashmap.put("one", 1);
        hashmap.put("two", 2);
        hashmap.put("three", 3);

        // Iterating over the HashMap
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Adding more entries to the Multimap
        multimap.put("key1", "value1");
        multimap.put("key2", "value2");

        /* write */ multimap.put("key", "value");

        // Performing operations on Multimap
        for (String key : multimap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + multimap.get(key));
        }

        // Adding more logic
        int sum = 0;
        for (Integer value : hashmap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashmap: " + sum);

        // Conditional logic
        if (hashmap.containsKey("two")) {
            System.out.println("HashMap contains key 'two'");
        }

        // Performing some calculation
        int product = 1;
        for (Integer value : hashmap.values()) {
            product *= value;
        }
        System.out.println("Product of values in hashmap: " + product);

        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println(value);
    }
}