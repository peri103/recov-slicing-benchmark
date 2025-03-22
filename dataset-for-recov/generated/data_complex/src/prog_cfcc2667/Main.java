import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding some elements to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Iterating over the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Adding elements to the SortedMap
        /* write */ map.put(1, "Hello, World!");
        map.put(2, "Java Programming");
        map.put(3, "Complex Code");

        // Performing some operations on the SortedMap
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println("SortedMap Key: " + key + ", Value: " + map.get(key));
        }

        // More operations
        if (map.containsKey(2)) {
            System.out.println("Value associated with key 2: " + map.get(2));
        }

        // Fetching the value written earlier
        /* read */ String value = map.get(1);
        System.out.println("Fetched Value: " + value);

        // Further operations with SortedMap
        map.put(4, "Advanced Java");
        map.put(5, "Data Structures");

        for (Integer key : map.keySet()) {
            System.out.println("Final SortedMap Key: " + key + ", Value: " + map.get(key));
        }
    }
}