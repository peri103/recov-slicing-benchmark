import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        
        // Create a HashMap and add some elements
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        // Create an ImmutableList and populate it
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("apple");
        listBuilder.add("banana");
        ImmutableList<String> fruitList = listBuilder.build();
        
        // Use a loop to process elements in the fruitList
        for (String fruit : fruitList) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Simulate the put operation using the builder
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();
        
        // Use the get method to read the value
        /* read */ Integer value = map.get("key");
        
        // Print the value to ensure it was read correctly
        System.out.println("Value from ImmutableMap: " + value);
        
        // Process elements in the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        // Perform some mathematical operations
        int a = 5;
        int b = 10;
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum + ", Product: " + product);
        
        // Add more elements to the ImmutableList
        listBuilder.add("cherry");
        listBuilder.add("date");
        ImmutableList<String> extendedFruitList = listBuilder.build();
        
        // Print the extended list
        for (String fruit : extendedFruitList) {
            System.out.println("Extended Fruit: " + fruit);
        }
    }
}