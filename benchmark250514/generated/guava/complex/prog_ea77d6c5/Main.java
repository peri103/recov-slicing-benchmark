import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        HashMap<String, String> stringMap = new HashMap<>();
        
        // Adding some entries to the stringMap
        stringMap.put("name", "Alice");
        stringMap.put("city", "Wonderland");
        
        // Performing operations on stringMap
        String name = stringMap.get("name");
        System.out.println("Name: " + name);
        
        /* write */ map.put("key1", 100);
        
        // More operations on stringMap
        if (stringMap.containsKey("city")) {
            System.out.println("City is present in the map.");
        }
        
        // Iterating over stringMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Another unrelated operation
        HashMap<Integer, String> numberMap = new HashMap<>();
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        
        for (Map.Entry<Integer, String> entry : numberMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        /* read */ int value = map.get("key1");
        System.out.println("Retrieved value: " + value);
        
        // More operations on numberMap
        numberMap.put(3, "Three");
        
        for (Integer key : numberMap.keySet()) {
            System.out.println("Key: " + key);
        }
        
        // Final operation on stringMap
        stringMap.put("country", "Fantasy Land");
        System.out.println("Country: " + stringMap.get("country"));
    }
}