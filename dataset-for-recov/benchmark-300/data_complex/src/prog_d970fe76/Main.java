import java.util.TreeMap;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        Random random = new Random();
        
        // Insert some random values into the HashMap
        for (int i = 0; i < 10; i++) {
            hashMap.put("hashKey" + i, random.nextInt(100));
        }
        
        // Perform the original write operation
        /* write */ map.put("key", 42);
        
        // Process the HashMap and print its values
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        // Perform the original read operation
        /* read */ Integer value = map.get("key");
        System.out.println("TreeMap Value: " + value);
        
        // Add more complexity by manipulating the TreeMap
        for (int i = 0; i < 5; i++) {
            map.put("additionalKey" + i, random.nextInt(100));
        }
        
        // Print all entries in the TreeMap
        for (String key : map.keySet()) {
            System.out.println("TreeMap Key: " + key + ", Value: " + map.get(key));
        }
    }
}