import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = new ImmutableRangeSet.Builder<>();
        
        // Add range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Create an ArrayList and add some values
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        
        // Process each number in the ArrayList
        for (Integer number : numbers) {
            if (rangeSet.contains(number)) {
                System.out.println("Number " + number + " is within the range.");
            } else {
                System.out.println("Number " + number + " is outside the range.");
            }
        }
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
        
        // Check if a specific value is within the range
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("Does the range contain 5? " + containsValue); // Should print true
        
        // Create another range and check overlap
        Range<Integer> anotherRange = Range.closed(5, 15);
        boolean overlaps = rangeSet.intersects(anotherRange);
        System.out.println("Does the range overlap with [5, 15]? " + overlaps);
    }
}