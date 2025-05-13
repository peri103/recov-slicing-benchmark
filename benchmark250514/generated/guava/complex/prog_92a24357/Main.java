import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original SetMultimap write-read pair
        SetMultimap<String, Integer> multimap = HashMultimap.create();
        /* write */ multimap.put("key", 42);

        // Adding complexity with HashMap
        Map<String, String> map = new HashMap<>();
        map.put("first", "Hello");
        map.put("second", "World");
        
        // Iterating over the HashMap
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Adding more complexity with another SetMultimap pair
        SetMultimap<String, String> stringMultimap = HashMultimap.create();
        stringMultimap.put("greeting", "Hi");
        stringMultimap.put("greeting", "Hello");
        
        // Iterating over the SetMultimap
        Set<String> greetings = stringMultimap.get("greeting");
        for (String greeting : greetings) {
            System.out.println(greeting);
        }

        // Unrelated computation
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Final read operation for the original SetMultimap
        /* read */ Set<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}