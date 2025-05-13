import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        HashMap<String, String> simpleMap = new HashMap<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the HashMap
        simpleMap.put("first", "apple");
        simpleMap.put("second", "banana");

        // Add some numbers to the ArrayList
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        // Perform some operations with the numbers
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // More complex operations
        if (simpleMap.containsKey("first")) {
            System.out.println("First element in simpleMap: " + simpleMap.get("first"));
        }

        /* write */ map.put("key", 123); // Original write operation

        // Add more entries to the HashBiMap
        map.put("anotherKey", 456);
        map.put("thirdKey", 789);

        // Perform operations with the HashBiMap
        if (map.containsKey("anotherKey")) {
            System.out.println("Another key value: " + map.get("anotherKey"));
        }

        // Some unrelated computations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ int value = map.get("key"); // Original read operation
        System.out.println("Original key value: " + value);

        // Further operations with HashBiMap
        if (map.containsKey("thirdKey")) {
            System.out.println("Third key value: " + map.get("thirdKey"));
        }
    }
}