import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Add elements to the ArrayList
        stringList.add("Hello");
        stringList.add("World");
        
        // Add elements to the HashMap
        map.put("Key1", 100);
        map.put("Key2", 200);
        
        // Perform some operations on the ArrayList
        for (String str : stringList) {
            System.out.println("String List Element: " + str);
        }
        
        /* write */ entry.setExternalAttributes(12345L);
        
        // Perform some operations on the HashMap
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }
        
        // Calculate sum of values in the HashMap
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);
        
        /* read */ long externalAttributes = entry.getExternalAttributes();
        System.out.println("External Attributes: " + externalAttributes);
        
        // Perform additional operations
        stringList.add("New Element");
        map.put("Key3", 300);
        
        // Print updated collections
        System.out.println("Updated String List: " + stringList);
        System.out.println("Updated Map: " + map);
    }
}