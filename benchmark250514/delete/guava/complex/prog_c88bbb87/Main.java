import com.google.common.collect.LinkedHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, Integer> biMap = LinkedHashBiMap.create();
        HashMap<String, String> stringMap = new HashMap<>();
        HashMap<Integer, String> intMap = new HashMap<>();

        // Adding some initial data to the maps
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");
        intMap.put(1, "One");
        intMap.put(2, "Two");

        // Performing some operations on the maps
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : intMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ biMap.put("key1", 100);

        // More complex operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        System.out.println("Sum: " + sum);

        // Adding more entries to biMap
        biMap.put("key2", 200);
        biMap.put("key3", 300);

        // Print all entries in biMap
        for (Map.Entry<String, Integer> entry : biMap.entrySet()) {
            System.out.println("BiMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* read */ Integer value = biMap.get("key1");
        System.out.println(value);

        // Further operations on biMap
        biMap.inverse().put(400, "key4");
        System.out.println("Inverse BiMap Key: 400, Value: " + biMap.inverse().get(400));
    }
}