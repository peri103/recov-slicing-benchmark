import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize base map for FixedSizeMap
        HashMap<String, Integer> baseMap = new HashMap<>();
        baseMap.put("key1", 0);
        FixedSizeMap<String, Integer> map = FixedSizeMap.fixedSizeMap(baseMap);
        
        // Initialize additional data structures
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Perform some operations on the list
        for (String str : list) {
            System.out.println("List item: " + str);
        }

        // Use FixedSizeMap
        /* write */ map.put("key1", 42);
        
        // Perform some operations unrelated to map
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to 5: " + sum);

        // Use another map to demonstrate complexity
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("greeting", "Hello");
        stringMap.put("farewell", "Goodbye");

        String greeting = stringMap.get("greeting");
        System.out.println("Greeting from stringMap: " + greeting);

        // Continue with FixedSizeMap
        /* read */ int value = map.get("key1");
        System.out.println("Value from FixedSizeMap: " + value);

        // Perform some operations on stringMap
        for (String key : stringMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + stringMap.get(key));
        }
    }
}