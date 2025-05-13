import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a mutable map to populate the ImmutableClassToInstanceMap
        MutableClassToInstanceMap<Object> mutableMap = MutableClassToInstanceMap.create();
        
        // Use the write method to put an instance into the map
        /* write */ mutableMap.putInstance(String.class, "Hello, World!");
        
        // Create a HashMap and populate it
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        
        // Build an immutable map from the HashMap
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.copyOf(hashMap);
        
        // Print all entries in the immutable map
        for (String key : immutableMap.keySet()) {
            System.out.println(key + ": " + immutableMap.get(key));
        }
        
        // Create a HashSet and populate it
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        
        // Build an immutable set from the HashSet
        ImmutableSet<String> immutableSet = ImmutableSet.copyOf(hashSet);
        
        // Print all elements in the immutable set
        for (String fruit : immutableSet) {
            System.out.println(fruit);
        }
        
        // Build the immutable map from the mutable map
        ImmutableClassToInstanceMap<Object> immutableClassMap = ImmutableClassToInstanceMap.copyOf(mutableMap);
        
        // Additional operations with the immutable class map
        if (immutableClassMap.getInstance(Integer.class) == null) {
            System.out.println("Integer instance not found.");
        }
        
        // Use the read method to retrieve the instance
        /* read */ String value = immutableClassMap.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
        
        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}