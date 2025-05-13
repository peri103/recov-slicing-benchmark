import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a SetMultimap
        SetMultimap<String, Integer> multimap = HashMultimap.create();

        // Initialize a HashMap for additional complexity
        Map<String, String> map = new HashMap<>();
        map.put("keyA", "valueA");
        map.put("keyB", "valueB");

        // Perform operations on the HashMap
        String mapValue = map.get("keyA");
        System.out.println("Map value for keyA: " + mapValue);

        // Add multiple values to the multimap
        multimap.put("key1", 42);
        multimap.put("key1", 43);
        multimap.put("key2", 44);

        // Perform unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More operations on the multimap
        multimap.put("key3", 45);
        multimap.put("key3", 46);

        // Perform some operations on the HashMap
        map.put("keyC", "valueC");
        mapValue = map.get("keyB");
        System.out.println("Map value for keyB: " + mapValue);

        // Read values from the multimap
        /* read */ Set<Integer> values = multimap.get("key1");
        for (Integer value : values) {
            System.out.println("Multimap value for key1: " + value);
        }

        // More computations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}