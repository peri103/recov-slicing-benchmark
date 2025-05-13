import org.apache.commons.collections4.map.LRUMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LRUMap<String, Integer> lruMap = new LRUMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        
        // Add some values to the hashMap
        hashMap.put("name", "Alice");
        hashMap.put("country", "Wonderland");

        /* write */ lruMap.put("key", 42);

        // Perform some operations on the hashMap
        if (hashMap.containsKey("name")) {
            System.out.println("Name: " + hashMap.get("name"));
        }

        // Iterate over the hashMap and print values
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* read */ Integer value = lruMap.get("key");
        System.out.println(value);

        // Add more entries to the lruMap and print them
        lruMap.put("anotherKey", 84);
        lruMap.put("yetAnotherKey", 126);
        
        for (Map.Entry<String, Integer> entry : lruMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}