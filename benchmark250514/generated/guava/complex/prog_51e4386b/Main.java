import com.google.common.collect.ListMultimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ListMultimap instance
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();

        // Initialize a HashMap for additional complexity
        Map<String, Integer> map = new HashMap<>();

        // Populate the HashMap with some values
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Iterate over the map and perform some operations
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            multimap.put(entry.getKey(), entry.getValue() * 10);
        }

        // Write a specific value to the multimap
        /* write */ multimap.put("key1", 42);

        // Perform some unrelated operations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);

        // Read the value from the multimap
        /* read */ Integer value = multimap.get("key1").get(0);

        // Print the read value
        System.out.println("Read value from multimap: " + value);

        // Further operations to add complexity
        for (String key : multimap.keySet()) {
            System.out.println("Values for key " + key + ": " + multimap.get(key));
        }

        // Calculate the total of all values in the multimap
        int total = 0;
        for (String key : multimap.keySet()) {
            for (Integer val : multimap.get(key)) {
                total += val;
            }
        }
        System.out.println("Total of all values in multimap: " + total);
    }
}