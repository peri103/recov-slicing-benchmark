import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initial setup for the original write-read pair
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("key", 42); // Initial value to ensure the map is not empty
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(originalMap);
        
        // Additional complex operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i); // Adding squares of numbers to the list
        }
        
        // Perform some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of squares: " + sum);
        
        // Simulate a complex calculation
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= i; // Factorial calculation
        }
        System.out.println("Factorial of 5: " + result);
        
        // Simulate the original write operation
        /* write */ originalMap.put("key", 100); // Simulate the write operation
        unmodifiableMap = UnmodifiableMap.unmodifiableMap(originalMap); // Recreate the unmodifiable map

        // More complex operations
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "world");
        stringMap.put("java", "programming");
        
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        // Perform some list operations
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
        
        // Reading the value from the unmodifiable map
        /* read */ int value = unmodifiableMap.get("key");
        System.out.println("Value from unmodifiable map: " + value);
    }
}