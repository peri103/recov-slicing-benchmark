import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        FixedSizeMap<String, Integer> map = FixedSizeMap.fixedSizeMap(baseMap);
        
        /* write */ map.put("key", 42);
        
        // Additional code using ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        
        // Perform some operations on the list
        for (String fruit : list) {
            System.out.println(fruit);
        }
        
        // Additional code using another FixedSizeMap
        HashMap<String, String> anotherBaseMap = new HashMap<>();
        FixedSizeMap<String, String> anotherMap = FixedSizeMap.fixedSizeMap(anotherBaseMap);
        anotherMap.put("fruit", "orange");
        anotherMap.put("vegetable", "carrot");
        
        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Perform calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // More operations on the list
        list.remove("banana");
        list.add("date");
        
        for (String fruit : list) {
            System.out.println("Updated list: " + fruit);
        }
        
        /* read */ int value = map.get("key");
        System.out.println("Retrieved value: " + value);
    }
}