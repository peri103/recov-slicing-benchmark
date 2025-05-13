import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;
import org.apache.commons.collections4.map.DualLinkedHashBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();
        AbstractDualBidiMap<String, Integer> anotherMap = new DualLinkedHashBidiMap<>();
        Map<String, String> simpleMap = new HashMap<>();

        // Adding elements to anotherMap
        anotherMap.put("keyA", 200);
        anotherMap.put("keyB", 300);

        // Adding elements to simpleMap
        simpleMap.put("simpleKey1", "simpleValue1");
        simpleMap.put("simpleKey2", "simpleValue2");

        // Performing operations on simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Adding elements to map
        /* write */ map.put("key1", 100);

        // Performing operations on anotherMap
        for (String key : anotherMap.keySet()) {
            System.out.println("AnotherMap Key: " + key + " -> Value: " + anotherMap.get(key));
        }

        // Additional operations on map
        map.put("key2", 400);
        map.put("key3", 500);

        // Retrieving and printing values from map
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + " -> Value: " + map.get(key));
        }

        // Reading the specific value from map
        /* read */ Integer value = map.get("key1");
        System.out.println("Retrieved Value: " + value);

        // Further operations on map
        map.put("key4", 600);
        map.put("key5", 700);

        // Iterating over map to print all elements
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Final Map Entry: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}