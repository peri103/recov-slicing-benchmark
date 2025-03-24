import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Initialize some unrelated data
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("cherry", 30);
        
        // Perform some operations with hashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Write to the SortedMap
        /* write */ map.put(1, "Hello");
        
        // Perform some more unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Read from the SortedMap
        /* read */ String value = map.get(1);
        System.out.println("Value from SortedMap: " + value);
        
        // Additional unrelated code
        SortedMap<Integer, String> anotherMap = new TreeMap<>();
        anotherMap.put(2, "World");
        anotherMap.put(3, "Java");
        
        for (Map.Entry<Integer, String> entry : anotherMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}