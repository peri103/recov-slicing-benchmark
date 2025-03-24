import java.util.SortedMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        
        // Initialize some data
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }
        
        // Perform some operations on the list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 20 == 0) {
                list.set(i, list.get(i) + 5);
            }
        }
        
        // Write to the map
        /* write */ map.put("key", 42);
        
        // Perform some more operations
        SortedMap<String, Integer> anotherMap = new TreeMap<>();
        anotherMap.put("anotherKey", 100);
        anotherMap.put("yetAnotherKey", 200);
        
        // Read from the map
        /* read */ int value = map.get("key");
        
        // Print the value
        System.out.println(value);
        
        // Print the list
        for (int num : list) {
            System.out.println(num);
        }
        
        // Print the anotherMap
        for (String key : anotherMap.keySet()) {
            System.out.println(key + " -> " + anotherMap.get(key));
        }
    }
}