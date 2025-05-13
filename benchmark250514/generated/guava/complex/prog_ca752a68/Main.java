import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, Integer> simpleMap = new HashMap<>();
        
        /* write */ multimap.put("key1", 42);
        
        simpleMap.put("key2", 100);
        simpleMap.put("key3", 200);
        
        int total = 0;
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            total += entry.getValue();
        }
        
        System.out.println("Total from simpleMap: " + total);
        
        if (multimap.containsKey("key1")) {
            System.out.println("Multimap contains key1");
        }
        
        Integer valueFromSimpleMap = simpleMap.get("key2");
        System.out.println("Value from simpleMap with key2: " + valueFromSimpleMap);
        
        /* read */ Integer value = multimap.get("key1").get(0);
        System.out.println("Value from multimap with key1: " + value);
        
        multimap.put("key4", 300);
        multimap.put("key5", 400);
        
        for (String key : multimap.keySet()) {
            System.out.println("Values for key " + key + ": " + multimap.get(key));
        }
        
        int sumMultimapValues = 0;
        for (String key : multimap.keySet()) {
            for (Integer val : multimap.get(key)) {
                sumMultimapValues += val;
            }
        }
        
        System.out.println("Sum of all values in multimap: " + sumMultimapValues);
    }
}