import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Create another ImmutableRangeSet for demonstration
        ImmutableRangeSet.Builder<Integer> anotherBuilder = ImmutableRangeSet.builder();
        anotherBuilder.add(Range.closed(20, 30));
        ImmutableRangeSet<Integer> anotherRangeSet = anotherBuilder.build();
        
        // Build the original ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Perform operations with another RangeSet
        boolean anotherContains = anotherRangeSet.contains(25);
        System.out.println("Another RangeSet contains 25: " + anotherContains);
        
        // Create a list to store ranges
        ArrayList<Range<Integer>> rangeList = new ArrayList<>();
        rangeList.add(Range.closed(5, 15));
        rangeList.add(Range.closed(100, 200));
        
        // Create an ImmutableList from the range list
        ImmutableList<Range<Integer>> immutableRangeList = ImmutableList.copyOf(rangeList);
        System.out.println("Immutable Range List: " + immutableRangeList);
        
        // Check if a number is within the original range
        /* read */ boolean contains = rangeSet.contains(5);
        
        // Print the result
        System.out.println("Original RangeSet contains 5: " + contains);
        
        // Iterate over the range list and print each range
        for (Range<Integer> range : rangeList) {
            System.out.println("Range: " + range);
        }
        
        // Perform additional operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}