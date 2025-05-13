import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize SetMultimap and HashMap
        SetMultimap<String, Integer> multimap = HashMultimap.create();
        Map<String, String> hashMap = new HashMap<>();

        // Adding key-value pairs to HashMap
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        // Process data in HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Add a value to the multimap
        /* write */ multimap.put("key1", 42);

        // Perform operations unrelated to multimap
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Further manipulation of HashMap
        hashMap.put("occupation", "Explorer");
        if (hashMap.containsKey("occupation")) {
            System.out.println("Occupation: " + hashMap.get("occupation"));
        }

        // Read the value from the multimap
        /* read */ Set<Integer> values = multimap.get("key1");
        for (Integer value : values) {
            System.out.println(value);
        }

        // Additional operations with HashMap
        hashMap.put("status", "Active");
        if (hashMap.containsValue("Active")) {
            System.out.println("Status is Active");
        }
    }
}