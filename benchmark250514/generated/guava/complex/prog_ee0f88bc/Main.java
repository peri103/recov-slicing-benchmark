import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using MutableClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Initialize a HashMap for additional complexity
        Map<Integer, String> hashMap = new HashMap<>();
        
        // Populate the HashMap with some values
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        
        // Perform operations on the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Use the write method to store a value in the MutableClassToInstanceMap
        /* write */ map.putInstance(String.class, "Hello, World!");
        
        // Perform additional operations to increase complexity
        int sumKeys = 0;
        for (Integer key : hashMap.keySet()) {
            sumKeys += key;
        }
        System.out.println("Sum of keys: " + sumKeys);
        
        // Use the read method to retrieve the stored value
        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);
        
        // Further operations with HashMap
        hashMap.put(4, "Four");
        hashMap.remove(2);
        
        // Display updated HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Updated Key: " + entry.getKey() + ", Updated Value: " + entry.getValue());
        }
    }
}