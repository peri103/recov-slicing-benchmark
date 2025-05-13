import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BiMap<String, Integer> biMap = HashBiMap.create();
        Map<String, String> stringMap = new HashMap<>();

        // Insert some values into the stringMap
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");

        // Perform some operations on stringMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Fruit: " + entry.getValue());
        }

        // Add more elements to biMap
        biMap.put("anotherKey", 100);
        biMap.put("yetAnotherKey", 200);
        
        // Perform some computation
        int sum = 0;
        for (Integer value : biMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in biMap: " + sum);

        /* write */ biMap.put("key", 42);

        // More operations
        if (biMap.containsKey("anotherKey")) {
            System.out.println("anotherKey exists in biMap.");
        }

        // More unrelated operations
        Map<Integer, String> numberMap = new HashMap<>();
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        numberMap.put(3, "Three");

        for (Integer num : numberMap.keySet()) {
            System.out.println("Number " + num + " maps to " + numberMap.get(num));
        }

        // Another computation
        int product = 1;
        for (Integer num : numberMap.keySet()) {
            product *= num;
        }
        System.out.println("Product of keys in numberMap: " + product);

        /* read */ Integer value = biMap.get("key");
        System.out.println("Retrieved value: " + value);
    }
}