import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using DualHashBidiMap which is a concrete implementation of AbstractDualBidiMap
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();

        // Initialize a regular HashMap for additional complexity
        Map<String, String> regularMap = new HashMap<>();
        
        // Add some entries to the regular map
        regularMap.put("name", "Alice");
        regularMap.put("city", "Wonderland");
        
        // Perform some operations on the regular map
        String name = regularMap.get("name");
        System.out.println("Name: " + name);
        
        // Write operation on AbstractDualBidiMap
        /* write */ map.put("key1", 100);

        // Add more entries to the DualHashBidiMap
        map.put("key2", 200);
        map.put("key3", 300);

        // Perform some operations on the regular map
        regularMap.put("occupation", "Explorer");
        String occupation = regularMap.get("occupation");
        System.out.println("Occupation: " + occupation);

        // Read operation on AbstractDualBidiMap
        /* read */ int value = map.get("key1");
        
        // Output the read value
        System.out.println("Value from DualHashBidiMap: " + value);

        // Iterate over the entries in the DualHashBidiMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Perform additional operations on the regular map
        regularMap.put("hobby", "Reading");
        String hobby = regularMap.get("hobby");
        System.out.println("Hobby: " + hobby);

        // Output the size of both maps
        System.out.println("Size of regular map: " + regularMap.size());
        System.out.println("Size of DualHashBidiMap: " + map.size());
    }
}