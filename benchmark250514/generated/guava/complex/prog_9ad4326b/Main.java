import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a builder instance for ImmutableMap
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        
        // Use the builder to add key-value pairs
        /* write */ builder.put("key", "value");
        
        // Create a simple HashMap and perform operations
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Iterate over the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        // Create an ArrayList and perform operations
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }
        
        // Print elements of the ArrayList
        for (int value : arrayList) {
            System.out.println("ArrayList Value: " + value);
        }
        
        // Build the ImmutableMap
        ImmutableMap<String, String> map = builder.build();
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Read the value using the key
        /* read */ String value = map.get("key");
        
        // Print the value
        System.out.println("Read from ImmutableMap: " + value);
        
        // Further operations on ArrayList
        arrayList.add(100);
        arrayList.add(200);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Updated ArrayList Value: " + arrayList.get(i));
        }
    }
}