import com.google.common.collect.ImmutableSortedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Write a key-value pair into the builder
        /* write */ builder.put("key1", 100);
        
        // Add more key-value pairs to the builder
        builder.put("key2", 200);
        builder.put("key3", 300);
        
        // Build the ImmutableSortedMap from the builder
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Create a HashMap and populate it with some data
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        
        // Perform some operations on the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Create a TreeMap and populate it with data
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("alpha", 10);
        treeMap.put("beta", 20);
        treeMap.put("gamma", 30);
        
        // Perform some operations on the TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("TreeMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // More unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Read the value associated with the key "key1"
        /* read */ Integer value = map.get("key1");
        
        // Print the read value
        System.out.println("Value from ImmutableSortedMap: " + value);
        
        // Another loop for demonstration
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}