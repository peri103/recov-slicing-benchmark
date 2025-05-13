import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));

        // Perform some unrelated operations
        ImmutableSet<String> stringSet = ImmutableSet.of("apple", "banana", "cherry");
        System.out.println("ImmutableSet contains 'banana': " + stringSet.contains("banana"));

        // Create another range set for demonstration purposes
        ImmutableRangeSet.Builder<Integer> anotherBuilder = ImmutableRangeSet.builder();
        anotherBuilder.add(Range.closed(20, 30));
        ImmutableRangeSet<Integer> anotherRangeSet = anotherBuilder.build();
        System.out.println("AnotherRangeSet contains 25: " + anotherRangeSet.contains(25));

        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to 5: " + sum);

        // Check if a specific value is within the range set
        /* read */ boolean contains = rangeSet.contains(5);

        // Output the result
        System.out.println("RangeSet contains 5: " + contains);

        // Perform more unrelated operations
        ImmutableSet<Integer> numberSet = ImmutableSet.of(100, 200, 300);
        for (Integer number : numberSet) {
            System.out.println("Number in ImmutableSet: " + number);
        }
    }
}