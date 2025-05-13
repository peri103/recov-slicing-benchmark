import com.google.common.collect.ArrayListMultimap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        
        // Initialize a HashMap and populate it with some values
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);
        
        // Perform some operations on the HashMap
        int bananaValue = map.get("banana");
        System.out.println("Banana value: " + bananaValue);
        
        // Create an array and perform operations on it
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        /* write */ multimap.put("key", 42);
        
        // Perform some calculations
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers: " + sum);
        
        // Use a loop to modify the multimap
        for (int i = 0; i < 3; i++) {
            multimap.put("key" + i, i * 10);
        }
        
        /* read */ List<Integer> values = multimap.get("key");
        System.out.println(values.get(0));
        
        // Further operations on the multimap
        for (String k : multimap.keySet()) {
            List<Integer> vals = multimap.get(k);
            System.out.println("Values for " + k + ": " + vals);
        }
        
        // Use the map to perform a lookup
        if (map.containsKey("apple")) {
            System.out.println("Apple exists with value: " + map.get("apple"));
        }
    }
}