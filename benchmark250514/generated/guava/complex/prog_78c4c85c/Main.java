import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = LinkedHashMultimap.create();
        Map<String, Integer> simpleMap = new HashMap<>();

        // Adding some initial data to simpleMap
        simpleMap.put("alpha", 1);
        simpleMap.put("beta", 2);

        // Manipulating simpleMap
        for (String key : simpleMap.keySet()) {
            int value = simpleMap.get(key);
            simpleMap.put(key, value * 10);
        }

        // Additional operations on multimap
        multimap.put("key1", 100);
        multimap.put("key2", 200);

        // Original write operation
        /* write */ multimap.put("key", 42);

        // Further operations on multimap
        multimap.put("key1", 101);
        multimap.put("key2", 202);

        // Processing simpleMap
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("SimpleMap - Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Original read operation
        /* read */ Collection<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }

        // Additional operations on multimap
        Collection<Integer> valuesKey1 = multimap.get("key1");
        for (Integer value : valuesKey1) {
            System.out.println("Multimap - Key1: " + value);
        }

        Collection<Integer> valuesKey2 = multimap.get("key2");
        for (Integer value : valuesKey2) {
            System.out.println("Multimap - Key2: " + value);
        }
    }
}