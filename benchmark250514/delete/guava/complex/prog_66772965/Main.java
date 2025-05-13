import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        HashMap<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("anotherKey", 100);
        
        /* write */ map.put("key", 42);

        // Perform some operations on the simpleMap
        int anotherValue = simpleMap.get("anotherKey");
        System.out.println("Value from simpleMap: " + anotherValue);

        // Add more entries to the map
        map.put("secondKey", 84);
        map.put("thirdKey", 126);

        // Iterate through the map and print all values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of all values: " + sum);

        // Conditional logic
        if (map.containsKey("secondKey")) {
            System.out.println("Map contains secondKey.");
        } else {
            System.out.println("Map does not contain secondKey.");
        }

        /* read */ int value = map.get("key");
        System.out.println("Value for 'key': " + value);

        // More unrelated logic
        int product = 1;
        for (Integer value : map.values()) {
            product *= value;
        }
        System.out.println("Product of all values: " + product);
    }
}