import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractHashedMap<String, Integer> map = new HashedMap<>();
        HashMap<String, String> additionalMap = new HashMap<>();
        
        // Adding some unrelated operations to make the program more complex
        additionalMap.put("name", "Alice");
        additionalMap.put("city", "Wonderland");
        
        for (Map.Entry<String, String> entry : additionalMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* write */ map.put("key", 42);

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);
        
        // Using similar API pair but not marked with /* write */ and /* read */
        map.put("anotherKey", 100);
        int anotherValue = map.get("anotherKey");
        System.out.println("Another value: " + anotherValue);

        // Some more unrelated operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 natural numbers: " + product);

        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}