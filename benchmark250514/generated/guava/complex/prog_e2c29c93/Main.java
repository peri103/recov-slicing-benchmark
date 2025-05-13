import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Initialize builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Create some ranges and add them to the builder
        Range<Integer> range1 = Range.closed(1, 10);
        Range<Integer> range2 = Range.closed(20, 30);
        Range<Integer> range3 = Range.closed(40, 50);
        
        /* write */ builder.add(range1);
        builder.add(range2);
        builder.add(range3);
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();

        // Initialize additional data structures
        ImmutableSet<String> stringSet = ImmutableSet.of("apple", "banana", "cherry");
        ImmutableSortedSet<Integer> sortedNumbers = ImmutableSortedSet.of(5, 10, 15, 20, 25);

        // Perform some operations on the additional data structures
        for (String fruit : stringSet) {
            System.out.println("Fruit: " + fruit);
        }
        
        int sum = 0;
        for (int number : sortedNumbers) {
            sum += number;
        }
        System.out.println("Sum of sorted numbers: " + sum);

        // Perform some operations on the rangeSet
        boolean containsValue1 = rangeSet.contains(8);
        boolean containsValue2 = rangeSet.contains(15);
        System.out.println("RangeSet contains 8: " + containsValue1);
        System.out.println("RangeSet contains 15: " + containsValue2);

        // More complex logic involving calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Finally, check if the rangeSet contains a specific value
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("RangeSet contains 5: " + containsValue);
    }
}