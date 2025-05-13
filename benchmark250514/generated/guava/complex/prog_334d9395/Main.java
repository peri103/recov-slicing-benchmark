import com.google.common.collect.LinkedListMultimap;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        
        /* write */ multimap.put("key", 42);
        
        // Additional code using HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Alice");
        map.put("age", "30");
        
        // Perform operations on the HashMap
        if (map.containsKey("name")) {
            System.out.println("Name: " + map.get("name"));
        }
        
        map.put("location", "Wonderland");
        System.out.println("Location: " + map.get("location"));
        
        // More operations on the multimap
        multimap.put("key", 100);
        multimap.put("anotherKey", 200);
        
        // Iterate over the multimap values
        for (String key : multimap.keySet()) {
            List<Integer> values = multimap.get(key);
            System.out.println("Values for " + key + ": " + values);
        }
        
        // Perform operations unrelated to multimap
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Read operation from the original write-read pair
        /* read */ List<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println("Read Value: " + value);
        }
    }
}