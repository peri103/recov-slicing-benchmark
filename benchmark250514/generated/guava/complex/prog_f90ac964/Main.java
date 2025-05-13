import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = LinkedHashMultimap.create();
        Map<String, Integer> map = new HashMap<>();

        // Unrelated code to make the program more complex
        map.put("keyA", 100);
        map.put("keyB", 200);
        map.put("keyC", 300);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map Entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        // Another unrelated operation with the same multimap
        multimap.put("key2", "value2");
        multimap.put("key2", "value3");
        Collection<String> valuesForKey2 = multimap.get("key2");
        
        for (String value : valuesForKey2) {
            System.out.println("Values for key2: " + value);
        }

        /* write */ multimap.put("key1", "value1");
        
        // More unrelated operations
        multimap.put("key3", "value4");
        Collection<String> valuesForKey3 = multimap.get("key3");
        
        for (String value : valuesForKey3) {
            System.out.println("Values for key3: " + value);
        }

        /* read */ Collection<String> values = multimap.get("key1");
        
        for (String value : values) {
            System.out.println("Read value for key1: " + value);
        }
    }
}