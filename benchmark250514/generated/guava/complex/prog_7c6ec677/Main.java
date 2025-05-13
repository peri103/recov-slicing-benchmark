import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = LinkedHashMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        
        /* write */ multimap.put("key", "value");
        
        // Add some entries to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Additional operations on the multimap
        multimap.put("key", "anotherValue");
        multimap.put("anotherKey", "value3");
        
        // Process entries in the multimap
        for (String key : multimap.keySet()) {
            System.out.println("Multimap Key: " + key);
            Collection<String> valuesForKey = multimap.get(key);
            for (String value : valuesForKey) {
                System.out.println("Value: " + value);
            }
        }
        
        /* read */ Collection<String> values = multimap.get("key");
        
        for (String value : values) {
            System.out.println(value);
        }
        
        // More operations
        map.put("four", 4);
        map.put("five", 5);
        
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Map Value: " + map.get(key));
        }
    }
}