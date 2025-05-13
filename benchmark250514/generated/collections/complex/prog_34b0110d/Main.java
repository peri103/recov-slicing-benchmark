import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, String> map = new HashSetValuedHashMap<>();
        HashMap<String, Integer> numberMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Adding elements to the HashMap
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        
        // Perform operations on HashMap
        int sum = 0;
        for (Integer value : numberMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in numberMap: " + sum);

        // Perform operations on HashSet
        if (set.contains("banana")) {
            System.out.println("Set contains banana");
        }

        // Original write operation
        /* write */ map.put("key", "value");

        // Additional operations on HashSetValuedHashMap
        map.put("key", "anotherValue");
        map.put("anotherKey", "value2");

        // More complex operations
        for (String key : map.keySet()) {
            System.out.println("Values for key '" + key + "': " + map.get(key));
        }

        // Original read operation
        /* read */ String value = map.get("key").iterator().next();
        System.out.println(value);

        // Perform operations on HashSetValuedHashMap
        map.put("key", "thirdValue");
        for (String key : map.keySet()) {
            for (String val : map.get(key)) {
                System.out.println("Iterating values for key '" + key + "': " + val);
            }
        }
    }
}