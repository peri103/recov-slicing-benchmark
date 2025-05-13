import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.commons.collections4.MultiValuedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        /* write */ map.put("key1", 42);

        // Additional code to make the program more complex
        MultiValuedMap<String, String> stringMap = new HashSetValuedHashMap<>();
        stringMap.put("name", "Alice");
        stringMap.put("name", "Bob");
        stringMap.put("city", "Wonderland");

        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("x", 10);
        simpleMap.put("y", 20);

        for (String key : simpleMap.keySet()) {
            System.out.println("SimpleMap Key: " + key + ", Value: " + simpleMap.get(key));
        }

        for (String key : stringMap.keySet()) {
            System.out.println("StringMap Key: " + key + ", Values: " + stringMap.get(key));
        }

        int sum = 0;
        for (Integer value : simpleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in simpleMap: " + sum);

        // Perform some operations on the original map
        map.put("key2", 84);
        map.put("key3", 126);

        int product = 1;
        for (Integer value : map.get("key1")) {
            product *= value;
        }
        System.out.println("Product of values for 'key1': " + product);

        // Some unrelated logic
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Original read operation
        /* read */ Integer value = map.get("key1").iterator().next();
        System.out.println("Read value from original map: " + value);
    }
}