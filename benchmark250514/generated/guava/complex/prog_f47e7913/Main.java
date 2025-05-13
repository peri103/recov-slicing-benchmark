import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        Multimap<String, String> multimap2 = ArrayListMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        
        map.put("anotherKey", 100);
        multimap2.put("name", "Alice");
        
        /* write */ multimap.put("key", 42);
        
        multimap2.put("name", "Bob");
        map.put("yetAnotherKey", 200);
        
        // Perform some operations with multimap2
        if (multimap2.containsKey("name")) {
            for (String name : multimap2.get("name")) {
                System.out.println("Name: " + name);
            }
        }
        
        // Perform some operations with map
        int sum = 0;
        for (Integer val : map.values()) {
            sum += val;
        }
        System.out.println("Sum of map values: " + sum);
        
        // More operations with multimap
        multimap.put("key", 84);
        multimap.put("anotherKey", 21);
        
        /* read */ Integer value = multimap.get("key").iterator().next();
        
        System.out.println("First value for 'key': " + value);
        
        // Additional operations with multimap
        for (Integer val : multimap.get("anotherKey")) {
            System.out.println("Value for 'anotherKey': " + val);
        }
    }
}