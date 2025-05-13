import com.google.common.collect.TreeMultimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Original TreeMultimap
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        
        // Additional Multimap
        ArrayListMultimap<String, Integer> arrayListMultimap = ArrayListMultimap.create();
        
        // HashMap for demonstration
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding values to the HashMap
        hashMap.put("first", 1);
        hashMap.put("second", 2);
        
        // Loop to demonstrate operations on HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Additional write operation to ArrayListMultimap
        arrayListMultimap.put("anotherKey", 100);
        
        // Additional read operation from ArrayListMultimap
        Set<Integer> arrayListValues = arrayListMultimap.get("anotherKey");
        System.out.println("ArrayListMultimap Values: " + arrayListValues);

        /* write */ multimap.put("key", 42);

        // Additional operations
        multimap.put("anotherKey", 84);
        multimap.put("anotherKey", 126);
        
        // Complex operations on TreeMultimap
        Set<Integer> values = multimap.get("anotherKey");
        for (Integer val : values) {
            System.out.println("Multimap anotherKey Value: " + val);
        }

        /* read */ Integer value = multimap.get("key").first();

        System.out.println("Read value: " + value);
        
        // Final operations
        multimap.put("finalKey", 99);
        Set<Integer> finalValues = multimap.get("finalKey");
        System.out.println("Final Values: " + finalValues);
    }
}