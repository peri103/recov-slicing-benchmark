import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Create another range set for demonstration
        ImmutableRangeSet.Builder<Integer> anotherBuilder = ImmutableRangeSet.builder();
        anotherBuilder.add(Range.closed(5, 15));
        ImmutableRangeSet<Integer> anotherRangeSet = anotherBuilder.build();
        
        // Build the ImmutableRangeSet from the builder
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Perform operations on anotherRangeSet
        boolean anotherContains = anotherRangeSet.contains(12);
        System.out.println("Another RangeSet contains 12: " + anotherContains);
        
        // Create an ImmutableList for demonstration
        ImmutableList<Integer> immutableList = ImmutableList.of(1, 2, 3, 4, 5);
        for (Integer num : immutableList) {
            System.out.println("ImmutableList element: " + num);
        }
        
        // Check if a number is contained in the range set
        /* read */ boolean contains = rangeSet.contains(5);
        
        // Print the result
        System.out.println("RangeSet contains 5: " + contains); // Should print true
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // More operations with immutableList
        int product = 1;
        for (Integer num : immutableList) {
            product *= num;
        }
        System.out.println("Product of ImmutableList elements: " + product);
    }
}