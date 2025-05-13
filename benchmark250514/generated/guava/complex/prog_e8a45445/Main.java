import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, String> hashMap = new HashMap<>();
        
        // Adding elements to the HashMap
        hashMap.put("fruit", "apple");
        hashMap.put("vegetable", "carrot");
        
        // Printing the HashMap elements
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        /* write */ multimap.put("key", 42);
        
        // Performing some operations on the Multimap
        multimap.put("key", 84);
        multimap.put("anotherKey", 21);
        
        // Iterating over the Multimap
        for (String key : multimap.keySet()) {
            System.out.println(key + ": " + multimap.get(key));
        }
        
        // Calculating sum of values for "key"
        int sum = 0;
        for (Integer val : multimap.get("key")) {
            sum += val;
        }
        System.out.println("Sum of values for 'key': " + sum);
        
        /* read */ Integer value = multimap.get("key").iterator().next();
        
        System.out.println("Read value: " + value);
        
        // Adding more elements to the HashMap
        hashMap.put("grain", "rice");
        hashMap.put("drink", "coffee");
        
        // Printing the HashMap elements again
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}