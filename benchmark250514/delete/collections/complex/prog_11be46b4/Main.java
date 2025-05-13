import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();
        HashMap<String, Integer> anotherMap = new HashMap<>();
        
        anotherMap.put("key1", 100);
        anotherMap.put("key2", 200);
        
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            map.put(entry.getKey(), entry.getValue() + 10);
        }
        
        /* write */ map.put("key", 42);
        
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + " -> Values: " + map.get(key));
        }
        
        int sum = 0;
        for (Integer value : map.get("key1")) {
            sum += value;
        }
        System.out.println("Sum of values for 'key1': " + sum);

        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println("Value for 'key': " + value);
        
        map.put("key3", 300);
        map.put("key4", 400);
        
        for (String key : map.keySet()) {
            int total = 0;
            for (Integer val : map.get(key)) {
                total += val;
            }
            System.out.println("Total for " + key + ": " + total);
        }
    }
}