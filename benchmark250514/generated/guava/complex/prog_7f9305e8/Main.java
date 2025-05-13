import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        
        // Adding elements to the HashMap
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Processing the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Adding more elements to the LinkedListMultimap
        multimap.put("key1", 10);
        multimap.put("key2", 20);
        
        /* write */ multimap.put("key", 42);
        
        // Retrieving values from the LinkedListMultimap
        System.out.println("Values for key1: " + multimap.get("key1"));
        System.out.println("Values for key2: " + multimap.get("key2"));

        int sum = 0;
        for (Integer value : multimap.get("key1")) {
            sum += value;
        }
        System.out.println("Sum of values for key1: " + sum);

        /* read */ Integer value = multimap.get("key").get(0);
        System.out.println("Value for key: " + value);

        // Adding more elements to the LinkedListMultimap
        multimap.put("key3", 30);
        multimap.put("key4", 40);

        // Retrieving and displaying all values
        for (String key : multimap.keySet()) {
            System.out.println("Values for " + key + ": " + multimap.get(key));
        }
    }
}