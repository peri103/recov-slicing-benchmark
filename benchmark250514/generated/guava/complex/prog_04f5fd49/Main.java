import com.google.common.collect.TreeMultimap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> treeMultimap = TreeMultimap.create();
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Adding some elements to the hashMap
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        
        // Iterating over the hashMap and performing some operations
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Adding some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        /* write */ treeMultimap.put("key", 42);
        
        // Performing some operations with TreeMultimap
        treeMultimap.put("anotherKey", 100);
        treeMultimap.put("anotherKey", 200);
        
        // Retrieving and printing all values associated with "anotherKey"
        Set<Integer> values = treeMultimap.get("anotherKey");
        for (Integer val : values) {
            System.out.println("Value associated with 'anotherKey': " + val);
        }
        
        // More unrelated operations
        double average = sum / 10.0;
        System.out.println("Average: " + average);
        
        /* read */ Integer value = treeMultimap.get("key").first();
        System.out.println("Value associated with 'key': " + value);
    }
}