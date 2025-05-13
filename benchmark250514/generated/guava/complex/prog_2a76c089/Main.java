import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ImmutableRangeSet.Builder<Integer> builder = new ImmutableRangeSet.Builder<>();
        Set<Integer> numberSet = new HashSet<>();
        
        // Adding some numbers to the set
        for (int i = 1; i <= 20; i++) {
            numberSet.add(i);
        }
        
        // Adding some ranges to the builder
        builder.add(Range.closed(1, 10));
        builder.add(Range.closed(15, 20));
        
        // Adding a complex range
        builder.add(Range.closedOpen(21, 30));
        
        // Creating the immutable range set
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Performing some operations on the number set
        int sum = 0;
        for (Integer number : numberSet) {
            if (rangeSet.contains(number)) {
                sum += number;
            }
        }
        
        // Output the sum of numbers within the ranges
        System.out.println("Sum of numbers within the ranges: " + sum);
        
        // Adding more logic to make it complex
        int maxNumber = 25;
        for (int i = 1; i <= maxNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
        
        // Checking for a specific number in the range set
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("RangeSet contains 5: " + containsValue);
        
        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}