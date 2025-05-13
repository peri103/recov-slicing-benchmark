import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Write a value into the map
        /* write */ builder.put("key1", 100);
        
        // Build the map
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Create an ImmutableList and perform operations
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("apple");
        listBuilder.add("banana");
        ImmutableList<String> fruits = listBuilder.build();
        
        // Print all fruits
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Create a HashMap and perform operations
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "John Doe");
        hashMap.put("occupation", "Software Developer");
        
        // Print values from HashMap
        System.out.println("Name: " + hashMap.get("name"));
        System.out.println("Occupation: " + hashMap.get("occupation"));

        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the value from the map
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println("Value from ImmutableSortedMap: " + value);
    }
}