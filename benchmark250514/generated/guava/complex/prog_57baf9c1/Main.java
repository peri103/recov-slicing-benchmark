import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add more elements to the builder
        builder.add(10);
        builder.add(20);
        builder.add(30);
        
        /* write */ builder.add(42); // Add an element to the builder

        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();
        
        // Create an ImmutableList using another builder
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("apple");
        listBuilder.add("banana");
        listBuilder.add("cherry");
        ImmutableList<String> fruitList = listBuilder.build();
        
        // Create a HashMap and populate it with some data
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        
        // Iterate through the ImmutableList and print each element
        for (String fruit : fruitList) {
            System.out.println("Fruit: " + fruit + ", Count: " + map.get(fruit));
        }
        
        // Perform a calculation using map values
        int total = 0;
        for (Integer count : map.values()) {
            total += count;
        }
        System.out.println("Total fruit count: " + total);
        
        // Perform a complex operation with the set
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        System.out.println("Sum of set elements: " + sum);
        
        /* read */ boolean contains = set.contains(42); // Check if the set contains the element
        
        System.out.println("Set contains 42: " + contains); // Output the result
    }
}