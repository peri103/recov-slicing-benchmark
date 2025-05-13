import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.apache.commons.collections4.map.LinkedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using LinkedMap which is a concrete implementation of AbstractLinkedMap
        AbstractLinkedMap<String, Integer> map = new LinkedMap<>();

        // Write a value to the map
        /* write */ map.put("key", 42);

        // Initialize another map using HashMap
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("hello", "world");
        anotherMap.put("foo", "bar");

        // Perform some operations on anotherMap
        if (anotherMap.containsKey("hello")) {
            String greeting = anotherMap.get("hello");
            System.out.println("Greeting: " + greeting);
        }

        // Iterate over anotherMap and print all key-value pairs
        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Read the value from the map
        /* read */ Integer value = map.get("key");

        // Print the value to ensure the read operation is successful
        System.out.println("Value from AbstractLinkedMap: " + value);

        // Perform some operations with a simple array
        int[] numbers = {5, 10, 15, 20};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Another calculation
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of array numbers: " + product);
    }
}