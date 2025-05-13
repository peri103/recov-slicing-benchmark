import com.google.common.collect.ListMultimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ListMultimap
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();

        // Initialize another ListMultimap for additional operations
        ListMultimap<String, String> stringMultimap = ArrayListMultimap.create();
        
        // Initialize a HashMap for unrelated operations
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("A", "Apple");
        hashmap.put("B", "Banana");

        // Perform some operations on the unrelated HashMap
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Write a value into the multimap
        /* write */ multimap.put("key", 42);

        // Perform additional operations on the stringMultimap
        stringMultimap.put("fruit", "Apple");
        stringMultimap.put("fruit", "Banana");
        stringMultimap.put("vegetable", "Carrot");

        // Iterate over the stringMultimap and print values
        for (String key : stringMultimap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + stringMultimap.get(key));
        }

        // Add more values to the original multimap
        multimap.put("key", 84);
        multimap.put("anotherKey", 21);

        // Perform a calculation using values from the multimap
        int sum = 0;
        for (Integer num : multimap.get("key")) {
            sum += num;
        }
        System.out.println("Sum of values under 'key': " + sum);

        // Read the value from the multimap
        /* read */ Integer value = multimap.get("key").get(0);

        // Print the value to verify
        System.out.println("Read value: " + value);

        // More operations with unrelated hashmap
        hashmap.put("C", "Cherry");
        System.out.println("Updated HashMap: " + hashmap);
    }
}