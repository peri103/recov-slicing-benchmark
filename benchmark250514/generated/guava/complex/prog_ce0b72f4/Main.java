import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add elements to the builder
        /* write */ builder.add(1);
        
        // Create another ImmutableSortedSet for demonstration
        ImmutableSortedSet.Builder<Integer> anotherBuilder = ImmutableSortedSet.naturalOrder();
        anotherBuilder.add(2).add(3).add(4);
        ImmutableSortedSet<Integer> anotherSortedSet = anotherBuilder.build();

        // Perform some operations on anotherSortedSet
        boolean containsTwo = anotherSortedSet.contains(2);
        System.out.println("Does anotherSortedSet contain 2? " + containsTwo);

        // Build the original ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        // Use ImmutableList for additional complexity
        ImmutableList<Integer> immutableList = ImmutableList.of(5, 6, 7, 8, 9);
        for (Integer number : immutableList) {
            System.out.println("ImmutableList element: " + number);
        }

        // Perform some operations with a loop
        int sum = 0;
        for (Integer number : sortedSet) {
            sum += number;
        }
        System.out.println("Sum of elements in sortedSet: " + sum);

        // Check if the set contains the element 1
        /* read */ boolean containsValue = sortedSet.contains(1);
        
        // Print the result
        System.out.println("Does sortedSet contain 1? " + containsValue);
    }
}