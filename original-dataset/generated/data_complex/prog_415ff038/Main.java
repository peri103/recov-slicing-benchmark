import java.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        HashSet<String> keys = new HashSet<>();
        
        keys.add("key1");
        keys.add("key2");
        
        // Adding some initial values to the map
        map.put("key1", 10);
        map.put("key2", 20);
        
        // Adding a new key-value pair
        map.put("key3", 30);
        
        // Performing operations on the HashSet
        if (keys.contains("key1")) {
            System.out.println("key1 is present.");
        }
        
        // Iterating over the keys
        for (String key : keys) {
            System.out.println("Value for " + key + ": " + map.get(key));
        }
        
        /* write */ map.put("key", 42);
        
        // Some unrelated computation
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 4 is: " + sum);
        
        // More operations on the map
        map.put("key4", 40);
        map.put("key5", 50);
        
        // Checking if the map contains a specific key
        if (map.containsKey("key3")) {
            System.out.println("key3 is present in the map.");
        }
        
        // Performing a complex operation
        int totalSum = 0;
        for (String key : map.keySet()) {
            totalSum += map.get(key);
        }
        System.out.println("Total sum of all values in the map: " + totalSum);
        
        /* read */ Integer value = map.get("key");
        System.out.println("Value for 'key': " + value);
    }
}