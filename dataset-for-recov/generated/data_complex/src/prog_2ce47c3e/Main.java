import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        Map<String, String> hashMap = new HashMap<>();
        List<Integer> integerList = new ArrayList<>();

        // Adding elements to the HashMap
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        // Adding elements to the List
        for (int i = 0; i < 5; i++) {
            integerList.add(i * 10);
        }

        // Performing operations on the List
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println("List element at index " + i + ": " + integerList.get(i));
        }

        // Adding elements to the SortedMap
        /* write */ sortedMap.put("key1", 100);
        sortedMap.put("key2", 200);
        sortedMap.put("key3", 300);

        // Performing operations on the HashMap
        if (hashMap.containsKey("name")) {
            System.out.println("Name: " + hashMap.get("name"));
        }

        // Performing operations on the SortedMap
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("SortedMap entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        // Retrieving the value from the SortedMap
        /* read */ int value = sortedMap.get("key1");
        System.out.println("Retrieved value from SortedMap: " + value);
    }
}