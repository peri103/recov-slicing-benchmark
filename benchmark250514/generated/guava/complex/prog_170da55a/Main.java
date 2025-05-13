import com.google.common.collect.ArrayListMultimap;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayListMultimap
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        
        // Initialize a HashMap for additional complexity
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "John Doe");
        hashMap.put("occupation", "Software Developer");
        
        // Write a value to the multimap
        /* write */ multimap.put("key1", 100);
        
        // Add more data to the multimap
        multimap.put("key2", 200);
        multimap.put("key3", 300);
        
        // Perform some operations on the HashMap
        String name = hashMap.get("name");
        String occupation = hashMap.get("occupation");
        System.out.println("Name: " + name + ", Occupation: " + occupation);
        
        // Use a loop to iterate over keys in the multimap
        for (String key : multimap.keySet()) {
            List<Integer> values = multimap.get(key);
            System.out.println("Key: " + key + ", Values: " + values);
        }
        
        // Read the value from the multimap
        /* read */ List<Integer> valuesForKey1 = multimap.get("key1");
        
        // Print the value to verify it was read correctly
        System.out.println("Read value for key1: " + valuesForKey1.get(0));
        
        // Perform additional operations on the multimap
        multimap.put("key1", 150);
        List<Integer> updatedValuesForKey1 = multimap.get("key1");
        System.out.println("Updated values for key1: " + updatedValuesForKey1);
        
        // Final loop to demonstrate complexity
        for (String key : multimap.keySet()) {
            List<Integer> values = multimap.get(key);
            int sum = 0;
            for (Integer value : values) {
                sum += value;
            }
            System.out.println("Sum of values for key " + key + ": " + sum);
        }
    }
}