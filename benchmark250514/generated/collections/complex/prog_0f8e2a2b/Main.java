import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a TreeMap which is a sorted map
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Create an AbstractSortedMapDecorator using the TreeMap
        AbstractSortedMapDecorator<String, Integer> mapDecorator = new AbstractSortedMapDecorator<>(treeMap) {};
        
        /* write */ mapDecorator.put("key", 42);
        
        // Additional code using HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        // Loop through the HashMap and print the entries
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Additional code using ArrayList
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        // Print the contents of the ArrayList
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
        
        // Perform some calculations
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
        
        // Read from the original mapDecorator
        /* read */ Integer value = mapDecorator.get("key");
        
        System.out.println("Retrieved value: " + value);
        
        // More complex operations
        Map<String, List<Integer>> complexMap = new HashMap<>();
        complexMap.put("numbers", numbers);
        
        // Iterate over complexMap and perform operations
        for (Map.Entry<String, List<Integer>> entry : complexMap.entrySet()) {
            int total = 0;
            for (Integer num : entry.getValue()) {
                total += num;
            }
            System.out.println(entry.getKey() + " total: " + total);
        }
    }
}