import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize LinkedListMultimap
        LinkedListMultimap<String, String> multimap = LinkedListMultimap.create();
        
        // Initialize HashMap
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        
        // Initialize ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        
        // Add elements to HashMap
        arrayList.add("apple");
        arrayList.add("orange");
        hashMap.put("fruits", arrayList);
        
        // Add more elements to LinkedListMultimap
        multimap.put("key1", "value1");
        multimap.put("key2", "value2");
        
        // Add additional elements to LinkedListMultimap
        /* write */ multimap.put("key", "value");
        
        // Process HashMap data
        for (String key : hashMap.keySet()) {
            ArrayList<String> values = hashMap.get(key);
            for (String value : values) {
                System.out.println("HashMap contains: " + value);
            }
        }
        
        // Perform operations on ArrayList
        arrayList.add("banana");
        arrayList.remove("orange");
        
        // Retrieve a value from LinkedListMultimap
        /* read */ String value = multimap.get("key").get(0);
        
        // Print the retrieved value
        System.out.println(value);
        
        // Iterate over LinkedListMultimap
        for (String key : multimap.keySet()) {
            System.out.println("Multimap key: " + key);
            for (String val : multimap.get(key)) {
                System.out.println("Multimap value: " + val);
            }
        }
        
        // Perform additional operations on ArrayList
        for (String fruit : arrayList) {
            System.out.println("ArrayList contains: " + fruit);
        }
    }
}