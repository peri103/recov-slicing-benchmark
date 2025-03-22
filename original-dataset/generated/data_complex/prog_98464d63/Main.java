import java.util.TreeMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        
        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        // Adding elements to the HashMap
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");
        
        // Adding elements to the TreeMap
        /* write */ map.put("key1", 100);
        map.put("key2", 200);
        map.put("key3", 300);
        
        // Processing the ArrayList
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
        
        // Processing the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        // More operations with TreeMap
        map.put("key4", 400);
        map.put("key5", 500);
        
        // Retrieving and printing a value from the TreeMap
        /* read */ Integer value = map.get("key1");
        System.out.println("Retrieved value from TreeMap: " + value);
        
        // Additional processing
        for (String key : map.keySet()) {
            System.out.println("TreeMap Key: " + key + ", Value: " + map.get(key));
        }
    }
}