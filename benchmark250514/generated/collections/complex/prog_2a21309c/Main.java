import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize LazyMap
        HashMap<String, Integer> map = new HashMap<>();
        LazyMap<String, Integer> lazyMap = LazyMap.lazyMap(map, () -> 0);
        
        // Initialize another map for demonstration
        HashMap<String, String> stringMap = new HashMap<>();
        LazyMap<String, String> lazyStringMap = LazyMap.lazyMap(stringMap, () -> "default");
        
        // Put some values into lazyStringMap
        lazyStringMap.put("name", "John");
        lazyStringMap.put("city", "New York");
        
        // Perform operations on lazyStringMap
        System.out.println("Name: " + lazyStringMap.get("name"));
        System.out.println("City: " + lazyStringMap.get("city"));
        System.out.println("Country: " + lazyStringMap.get("country")); // Will return default value
        
        // Initialize an ArrayList
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        // Perform operations on numberList
        for (int num : numberList) {
            System.out.println("Number: " + num);
        }
        
        // Write to lazyMap
        /* write */ lazyMap.put("key", 42);
        
        // Perform unrelated calculations
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Read from lazyMap
        /* read */ int value = lazyMap.get("key");
        
        // Output the value read from lazyMap
        System.out.println("Value from lazyMap: " + value);
        
        // Perform more operations on lazyStringMap
        stringMap.put("language", "English");
        System.out.println("Language: " + lazyStringMap.get("language"));
    }
}