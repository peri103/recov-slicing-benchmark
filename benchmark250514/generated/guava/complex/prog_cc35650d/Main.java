import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> biMap = HashBiMap.create();
        Map<String, String> stringMap = new HashMap<>();
        Map<Integer, Double> doubleMap = new HashMap<>();

        // Adding elements to the stringMap
        stringMap.put("name", "Alice");
        stringMap.put("city", "Wonderland");

        // Adding elements to the doubleMap
        doubleMap.put(1, 3.14);
        doubleMap.put(2, 2.71);

        // Perform operations on the stringMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform operations on the doubleMap
        double sum = 0;
        for (Double value : doubleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in doubleMap: " + sum);

        // Original write-read pair
        /* write */ biMap.put("key", 42);

        // Perform additional operations
        biMap.put("anotherKey", 84);
        biMap.put("thirdKey", 126);
        
        // Perform a check on biMap
        if (biMap.containsKey("anotherKey")) {
            System.out.println("anotherKey exists in biMap.");
        }

        // More unrelated code
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Original read operation
        /* read */ Integer value = biMap.get("key");
        System.out.println("Value associated with 'key': " + value);
    }
}