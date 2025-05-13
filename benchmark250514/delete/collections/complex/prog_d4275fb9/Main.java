import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeValuedHashMap
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();

        // Initialize another map for additional complexity
        ArrayListValuedHashMap<String, String> map2 = new ArrayListValuedHashMap<>();

        // Add some values to the second map
        map2.put("fruit", "apple");
        map2.put("fruit", "banana");
        map2.put("color", "red");

        // Write a value into the original map
        /* write */ map.put("key1", 42);

        // Perform operations on the second map
        for (String key : map2.keySet()) {
            System.out.println("Values for " + key + ": " + map2.get(key));
        }

        // Manipulate data
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }

        // Read the value back from the original map
        /* read */ Integer value = map.get("key1").iterator().next();

        // Print the value to verify correctness
        System.out.println("Read value from TreeValuedHashMap: " + value);

        // Print the sum to show additional complexity
        System.out.println("Sum of numbers from 0 to 4: " + sum);
    }
}