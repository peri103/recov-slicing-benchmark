import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Create an ImmutableSet with some values
        ImmutableSet<Integer> immutableSet = ImmutableSet.of(11, 12, 13, 14, 15);
        
        // Process the ImmutableSet
        for (Integer value : immutableSet) {
            System.out.println("Processing value from ImmutableSet: " + value);
        }
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Create an ImmutableList and perform operations
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C", "D");
        for (String s : immutableList) {
            System.out.println("ImmutableList element: " + s);
        }
        
        // Some other computations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("Current sum: " + sum);
        }

        // Check if a value is contained in the range set
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        // Output the result
        System.out.println("Does rangeSet contain 5? " + containsValue);
        
        // Additional computations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
            System.out.println("Current product: " + product);
        }
    }
}