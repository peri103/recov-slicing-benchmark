import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.map.DualHashBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using a DualHashBidiMap which is a concrete implementation
        AbstractOrderedBidiMapDecorator<String, Integer> map = new AbstractOrderedBidiMapDecorator<>(new DualHashBidiMap<>());

        /* write */ map.put("key", 42);

        // Additional unrelated code to make the program more complex
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "John");
        hashMap.put("city", "New York");
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // More operations on the original map
        map.put("anotherKey", 100);
        map.put("thirdKey", 200);
        
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);

        // Adding more complexity with a simple calculation
        int a = 5, b = 10;
        int result = a * b + sum;
        System.out.println("Result of calculation: " + result);

        /* read */ Integer value = map.get("key");

        // Print the value that was read from the map
        System.out.println(value);

        // Additional logic to manipulate the map
        map.remove("anotherKey");
        if (map.containsKey("thirdKey")) {
            map.put("thirdKey", map.get("thirdKey") + 50);
        }
        
        System.out.println("Updated map values:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}