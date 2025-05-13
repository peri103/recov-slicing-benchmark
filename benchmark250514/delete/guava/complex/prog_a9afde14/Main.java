import com.google.common.collect.LinkedHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, String> map = LinkedHashBiMap.create();
        Map<String, Integer> hashMap = new HashMap<>();

        // Initialize a HashMap with some values
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        // Perform operations on the HashMap
        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        System.out.println("Sum of values in hashMap: " + sum);

        // Use the LinkedHashBiMap to store and retrieve data
        /* write */ map.put("key", "value");

        // More operations on HashMap
        hashMap.put("four", 4);
        hashMap.remove("two");

        // Calculate product of remaining values in HashMap
        int product = 1;
        for (int value : hashMap.values()) {
            product *= value;
        }
        System.out.println("Product of values in hashMap: " + product);

        // Retrieve the value from the LinkedHashBiMap
        /* read */ String value = map.get("key");
        System.out.println("Retrieved value from map: " + value);

        // Additional operations to make the program more complex
        LinkedHashBiMap<Integer, String> integerMap = LinkedHashBiMap.create();
        integerMap.put(1, "one");
        integerMap.put(2, "two");
        integerMap.put(3, "three");

        for (int i = 1; i <= 3; i++) {
            System.out.println("IntegerMap value for key " + i + ": " + integerMap.get(i));
        }

        // Modify and display the LinkedHashBiMap
        integerMap.put(4, "four");
        integerMap.remove(2);

        for (Map.Entry<Integer, String> entry : integerMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}