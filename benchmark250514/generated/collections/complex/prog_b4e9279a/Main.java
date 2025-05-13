import org.apache.commons.collections4.map.FixedSizeMap;

import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the FixedSizeMap with a backing HashMap
        FixedSizeMap<String, String> map = FixedSizeMap.fixedSizeMap(new HashMap<>());

        // Initialize additional data structures for complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        FixedSizeMap<Integer, String> anotherMap = FixedSizeMap.fixedSizeMap(new HashMap<>());

        // Populate the additional map
        anotherMap.put(1, "First");
        anotherMap.put(2, "Second");

        // Perform operations on the ArrayList
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Perform operations on the additional map
        for (Integer key : anotherMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + anotherMap.get(key));
        }

        /* write */ map.put("key", "value");

        // Perform unrelated operations on the ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Add more elements to the ArrayList
        numbers.add(100);
        numbers.add(200);

        // Print elements of the ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }

        /* read */ String value = map.get("key");

        // Print the value read from the original map
        System.out.println(value);
    }
}