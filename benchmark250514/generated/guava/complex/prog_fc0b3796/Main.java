import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        HashMap<String, String> stringMap = new HashMap<>();
        HashMap<Integer, String> intMap = new HashMap<>();
        
        stringMap.put("first", "Hello");
        intMap.put(1, "World");

        /* write */ map.put("one", 1);
        
        stringMap.put("second", "Java");
        intMap.put(2, "Programming");

        // Adding more complexity with additional operations
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : intMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Simulate some processing
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // More operations on the maps
        stringMap.put("third", "Guava");
        intMap.put(3, "Collections");

        /* read */ Integer value = map.get("one");
        System.out.println(value);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}