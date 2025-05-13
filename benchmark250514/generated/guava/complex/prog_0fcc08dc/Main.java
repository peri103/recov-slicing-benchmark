import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        Map<String, String> simpleMap = new HashMap<>();

        /* write */ multimap.put("key", 42);

        // Adding more complexity with another map
        simpleMap.put("name", "Alice");
        simpleMap.put("city", "Wonderland");

        // Performing operations on the simpleMap
        if (simpleMap.containsKey("name")) {
            System.out.println("Name is present in the map: " + simpleMap.get("name"));
        }

        // Adding more entries to the multimap
        multimap.put("key", 84);
        multimap.put("anotherKey", 168);

        // Iterating over entries in the multimap
        for (String key : multimap.keySet()) {
            System.out.println("Multimap key: " + key + ", values: " + multimap.get(key));
        }

        // More operations on simpleMap
        if (simpleMap.containsValue("Wonderland")) {
            System.out.println("Found the city in the map: " + simpleMap.get("city"));
        }

        /* read */ Integer value = multimap.get("key").get(0);

        System.out.println("First value for 'key': " + value);

        // Further operations to increase complexity
        int sum = 0;
        for (Integer val : multimap.values()) {
            sum += val;
        }
        System.out.println("Sum of all values in the multimap: " + sum);
    }
}