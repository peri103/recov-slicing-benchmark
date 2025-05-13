import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();

        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));

        // Create a HashSet to store some numbers
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i <= 15; i++) {
            numberSet.add(i);
        }

        // Perform some operations with the HashSet
        if (numberSet.contains(5)) {
            System.out.println("HashSet contains 5");
        }

        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();

        // Add some more logic to make the program complex
        int sum = 0;
        for (Integer number : numberSet) {
            if (rangeSet.contains(number)) {
                sum += number;
            }
        }
        System.out.println("Sum of numbers in range: " + sum);

        // Check if a specific value is within the range set
        /* read */ boolean containsValue = rangeSet.contains(5);

        // Output the result
        System.out.println(containsValue); // Expected output: true

        // Perform additional operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}