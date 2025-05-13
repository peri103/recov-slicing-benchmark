import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> initialMap = new HashMap<>();
        initialMap.put("key1", 0); // Initialize with default values to ensure fixed size
        FixedSizeMap<String, Integer> fixedSizeMap = FixedSizeMap.fixedSizeMap(initialMap);

        // Additional code using a different map
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("greeting", "Hello");
        anotherMap.put("farewell", "Goodbye");

        ArrayList<String> keys = new ArrayList<>(anotherMap.keySet());
        Collections.sort(keys);
        
        for (String key : keys) {
            System.out.println(key + ": " + anotherMap.get(key));
        }

        // Simulate some operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);

        // Write to the fixed size map
        /* write */ fixedSizeMap.put("key1", 42);

        // More operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Read from the fixed size map
        /* read */ int value = fixedSizeMap.get("key1");
        System.out.println("Value from FixedSizeMap: " + value);

        // Further operations with numbers
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }
}