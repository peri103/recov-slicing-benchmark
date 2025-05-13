import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        
        // Additional unrelated code for complexity
        HashMap<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("keyA", 100);
        simpleMap.put("keyB", 200);
        
        for (String key : simpleMap.keySet()) {
            map.put(key, simpleMap.get(key) + 50);
        }
        
        /* write */ map.put("key1", 42);
        
        Set<Integer> values = map.get("keyA");
        for (Integer val : values) {
            System.out.println("Value from map: " + val);
        }
        
        // More operations to increase complexity
        map.put("key2", 55);
        map.put("key2", 75);
        
        Set<Integer> key2Values = map.get("key2");
        for (Integer val : key2Values) {
            System.out.println("Value for key2: " + val);
        }
        
        /* read */ Integer value = map.get("key1").iterator().next();
        
        System.out.println(value);
    }
}