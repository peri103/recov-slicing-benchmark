import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, String> multimap = LinkedListMultimap.create();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        /* write */ multimap.put("key", "value");

        // Perform operations on HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Add more elements to the multimap
        multimap.put("anotherKey", "anotherValue");
        multimap.put("key", "secondValue");

        // Retrieve and print all values associated with "key"
        System.out.println("Values for 'key':");
        for (String val : multimap.get("key")) {
            System.out.println(val);
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println("First value for 'key': " + value);

        // More operations with HashMap
        map.put("four", 4);
        map.put("five", 5);
        int product = 1;
        for (Integer val : map.values()) {
            product *= val;
        }
        System.out.println("Product of all values in map: " + product);
    }
}