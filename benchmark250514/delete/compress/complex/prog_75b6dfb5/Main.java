import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        // Add some entries to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Add some entries to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        
        // Perform some operations on the map and list
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
        
        /* write */ gzipParameters.setExtraFlags(1);
        
        // More complex operations
        map.put("four", 4);
        list.add("date");
        
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);
        
        String concatenatedFruits = "";
        for (String fruit : list) {
            concatenatedFruits += fruit + " ";
        }
        System.out.println("Concatenated fruits: " + concatenatedFruits.trim());
        
        // Retrieve and print the extra flags
        /* read */ int extraFlags = gzipParameters.getExtraFlags();
        System.out.println("Extra Flags: " + extraFlags);
        
        // Final operations
        map.remove("two");
        list.remove("banana");
        
        System.out.println("Final map: " + map);
        System.out.println("Final list: " + list);
    }
}