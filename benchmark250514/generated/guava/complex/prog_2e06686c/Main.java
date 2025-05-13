import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayListMultimap instance
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        
        // Initialize a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        
        // Perform some operations on the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Use the write method to put a value into the multimap
        /* write */ multimap.put("key", 42);
        
        // Perform some operations on the HashMap
        hashMap.put("C", 30);
        hashMap.put("D", 40);
        
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of HashMap values: " + sum);
        
        // Initialize another ArrayListMultimap for more complexity
        ArrayListMultimap<String, String> stringMultimap = ArrayListMultimap.create();
        stringMultimap.put("animal", "cat");
        stringMultimap.put("animal", "dog");
        
        // Perform operations on the second ArrayListMultimap
        for (String animal : stringMultimap.get("animal")) {
            System.out.println("Animal: " + animal);
        }

        // Use the read method to retrieve the value from the multimap
        /* read */ Integer value = multimap.get("key").get(0);

        // Print the retrieved value to ensure correctness
        System.out.println(value);
    }
}