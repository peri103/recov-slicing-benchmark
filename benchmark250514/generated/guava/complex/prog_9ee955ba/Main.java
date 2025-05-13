import com.google.common.collect.TreeMultimap;
import com.google.common.collect.HashMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        HashMultimap<String, String> hashMultimap = HashMultimap.create();
        Map<String, Integer> simpleMap = new HashMap<>();

        /* write */ multimap.put("key", 1);

        // Adding elements to HashMultimap
        hashMultimap.put("fruit", "apple");
        hashMultimap.put("fruit", "banana");
        hashMultimap.put("color", "red");

        // Adding elements to simpleMap
        simpleMap.put("one", 1);
        simpleMap.put("two", 2);
        simpleMap.put("three", 3);

        // Perform operations on HashMultimap
        for (String key : hashMultimap.keySet()) {
            System.out.println("HashMultimap key: " + key + " values: " + hashMultimap.get(key));
        }

        // Perform operations on simpleMap
        int sum = 0;
        for (Integer value : simpleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in simpleMap: " + sum);

        // Perform some calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);

        // Reading from TreeMultimap
        /* read */ Integer value = multimap.get("key").first();
        System.out.println("Value from TreeMultimap: " + value);

        // Additional operations
        String concatenatedString = "";
        for (String str : hashMultimap.get("fruit")) {
            concatenatedString += str + " ";
        }
        System.out.println("Concatenated fruit names: " + concatenatedString.trim());
    }
}