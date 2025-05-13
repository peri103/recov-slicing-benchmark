import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.storeInCache("key", "value");

        // Initialize another data structure
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Perform some operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of map values: " + sum);

        // Add more data to the map
        map.put("four", 4);
        map.put("five", 5);

        // Perform another operation on the map
        int product = 1;
        for (Integer value : map.values()) {
            product *= value;
        }
        System.out.println("Product of map values: " + product);

        // Retrieve from cache
        String cachedValue = student.retrieveFromCache("key");
        System.out.println(cachedValue);

        // Additional operations
        int max = Integer.MIN_VALUE;
        for (Integer value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max value in map: " + max);
    }
}