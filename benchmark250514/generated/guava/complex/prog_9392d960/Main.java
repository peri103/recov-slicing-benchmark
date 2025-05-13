import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add an element to the builder
        /* write */ builder.add(42);
        
        // Create and manipulate a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Retrieve and print values from the map
        int valueOne = map.get("one");
        int valueTwo = map.get("two");
        System.out.println("Map values: " + valueOne + ", " + valueTwo);
        
        // Perform some calculations
        int sum = valueOne + valueTwo;
        int product = valueOne * valueTwo;
        System.out.println("Sum: " + sum + ", Product: " + product);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();
        
        // Check if the set contains the element
        /* read */ boolean contains = set.contains(42);
        
        // Print the result
        System.out.println("Contains 42: " + contains);
        
        // Create and manipulate another ImmutableSortedSet
        Builder<Integer> anotherBuilder = ImmutableSortedSet.naturalOrder();
        anotherBuilder.add(10).add(20).add(30);
        ImmutableSortedSet<Integer> anotherSet = anotherBuilder.build();
        
        // Iterate over the set and print each element
        System.out.println("Elements in another set:");
        for (Integer num : anotherSet) {
            System.out.println(num);
        }
        
        // Perform additional calculations
        int totalSum = sum + anotherSet.first() + anotherSet.last();
        System.out.println("Total sum: " + totalSum);
    }
}