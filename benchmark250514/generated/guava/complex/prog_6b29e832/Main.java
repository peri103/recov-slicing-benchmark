import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add some elements to the builder
        /* write */ builder.add(1);
        builder.add(2);
        builder.add(3);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();
        
        // Initialize an ImmutableList with some values
        ImmutableList<String> list = ImmutableList.of("apple", "banana", "cherry");
        
        // Create a HashMap to store fruit names and their quantities
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 10);
        fruitMap.put("banana", 20);
        fruitMap.put("cherry", 30);
        
        // Perform some operations on the HashMap
        for (String fruit : list) {
            System.out.println(fruit + ": " + fruitMap.get(fruit));
        }
        
        // Check if the ImmutableSortedSet contains a specific element
        /* read */ boolean contains = set.contains(1);
        
        // Print the result of the contains check
        System.out.println("Set contains 1: " + contains);
        
        // Additional complex logic: calculate the sum of values in the HashMap
        int sum = 0;
        for (Integer quantity : fruitMap.values()) {
            sum += quantity;
        }
        System.out.println("Total fruit quantity: " + sum);
        
        // Perform some operations on the ImmutableList
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
    }
}