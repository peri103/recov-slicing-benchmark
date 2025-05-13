import org.apache.commons.collections4.map.LRUMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LRUMap<String, Integer> map = new LRUMap<>(10);
        HashMap<String, String> hashMap = new HashMap<>();
        Map<String, Integer> anotherMap = new HashMap<>();

        // Performing operations on the hashMap
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        // Adding some entries to anotherMap
        anotherMap.put("one", 1);
        anotherMap.put("two", 2);
        anotherMap.put("three", 3);

        // Iterate over anotherMap
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* write */ map.put("key", 42);

        // Perform some operations on hashMap
        if (hashMap.containsKey("name")) {
            System.out.println("Name exists: " + hashMap.get("name"));
        }

        // More operations on anotherMap
        anotherMap.put("four", 4);
        anotherMap.remove("two");

        // Iterate over anotherMap again
        for (String key : anotherMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + anotherMap.get(key));
        }

        /* read */ Integer value = map.get("key");
        System.out.println(value);

        // Final operations on hashMap
        hashMap.put("country", "Imagination");
        System.out.println("City: " + hashMap.get("city"));
        System.out.println("Country: " + hashMap.get("country"));
    }
}