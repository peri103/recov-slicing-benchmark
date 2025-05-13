import com.google.common.collect.LinkedHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, Integer> biMap = LinkedHashBiMap.create();
        HashMap<String, String> hashMap = new HashMap<>();
        Map<String, Integer> anotherMap = new HashMap<>();

        // Insert unrelated data into hashMap
        hashMap.put("apple", "fruit");
        hashMap.put("carrot", "vegetable");
        
        // Use another map to store some data
        anotherMap.put("one", 1);
        anotherMap.put("two", 2);

        // Perform some operations on the maps
        if (hashMap.containsKey("apple")) {
            System.out.println("Apple is a " + hashMap.get("apple"));
        }

        // Insert more data into anotherMap
        anotherMap.put("three", 3);
        anotherMap.put("four", 4);

        // Perform operations on anotherMap
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /* write */ biMap.put("key", 42);

        // Perform additional operations
        int sum = 0;
        for (Integer value : anotherMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in anotherMap: " + sum);

        // More operations on hashMap
        hashMap.put("banana", "fruit");
        if (hashMap.containsValue("fruit")) {
            System.out.println("There are fruits in the hashMap.");
        }

        /* read */ Integer value = biMap.get("key");
        System.out.println(value);

        // Final operations
        if (biMap.containsKey("key")) {
            System.out.println("biMap has the key 'key'.");
        }
    }
}