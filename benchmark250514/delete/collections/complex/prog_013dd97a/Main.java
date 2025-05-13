import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initializing base map and unmodifiable map
        Map<String, Integer> baseMap = new HashMap<>();
        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(baseMap);

        // Initialize an ArrayList for additional complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        // Perform operations on ArrayList
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform operations on baseMap
        baseMap.put("anotherKey", 100);
        System.out.println("Value for 'anotherKey': " + baseMap.get("anotherKey"));

        // Original write operation on base map
        /* write */ baseMap.put("key", 42);

        // More operations on ArrayList
        int product = 1;
        for (int i = 0; i < numbers.size(); i++) {
            product *= numbers.get(i) + 1;
        }
        System.out.println("Product of numbers incremented by 1: " + product);

        // Original read operation from unmodifiable map
        /* read */ Integer value = unmodifiableMap.get("key");
        System.out.println("Value for 'key': " + value);

        // Additional operations on baseMap
        baseMap.put("thirdKey", 200);
        int total = 0;
        for (String key : baseMap.keySet()) {
            total += baseMap.get(key);
        }
        System.out.println("Total of all values in baseMap: " + total);
    }
}