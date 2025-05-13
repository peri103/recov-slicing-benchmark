import com.google.common.collect.ImmutableSortedSet;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Part 1: ImmutableSortedSet operations
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add elements to the builder
        /* write */ builder.add(1);
        
        // Add more elements to the builder
        builder.add(3);
        builder.add(2);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        // Unrelated operations with HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        
        // Perform operations on the map
        if (map.containsKey("one")) {
            System.out.println("Map contains key 'one'");
        }
        
        // Unrelated operations with ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        
        // Iterate over the ArrayList
        for (String item : list) {
            System.out.println(item);
        }
        
        // Perform operations on the sorted set
        int sum = 0;
        for (Integer num : sortedSet) {
            sum += num;
        }
        System.out.println("Sum of elements in sortedSet: " + sum);
        
        // Check if the set contains the element
        /* read */ boolean containsValue = sortedSet.contains(1);
        
        // Print the result
        System.out.println(containsValue);
        
        // Additional operations with ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        // Calculate the total sum of numbers in the ArrayList
        int totalSum = 0;
        for (int num : numbers) {
            totalSum += num;
        }
        System.out.println("Total sum of numbers: " + totalSum);
    }
}