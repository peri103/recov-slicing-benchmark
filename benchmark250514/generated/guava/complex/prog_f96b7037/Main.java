import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add elements using the builder
        /* write */ builder.add(1);
        
        // Add more elements to the builder
        builder.add(2);
        builder.add(3);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> immutableSortedSet = builder.build();
        
        // Perform some operations on a different collection
        ImmutableList<Integer> immutableList = ImmutableList.of(4, 5, 6);
        int sum = 0;
        for (int num : immutableList) {
            sum += num;
        }
        System.out.println("Sum of elements in ImmutableList: " + sum);
        
        // Perform some calculations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);
        
        // Check if the ImmutableSortedSet contains the element
        /* read */ boolean containsValue = immutableSortedSet.contains(1);
        
        // Print the result
        System.out.println("ImmutableSortedSet contains 1: " + containsValue);
        
        // Perform another operation on the ImmutableSortedSet
        for (Integer value : immutableSortedSet) {
            System.out.println("Value in ImmutableSortedSet: " + value);
        }
        
        // Create another ImmutableSortedSet and perform operations
        ImmutableSortedSet<Integer> anotherSet = ImmutableSortedSet.of(7, 8, 9);
        for (Integer value : anotherSet) {
            System.out.println("Value in another ImmutableSortedSet: " + value);
        }
    }
}