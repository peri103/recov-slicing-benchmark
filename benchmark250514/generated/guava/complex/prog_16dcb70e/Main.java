import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Initializing ImmutableRangeSet builder
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Adding ranges to the builder
        builder.add(Range.closed(1, 10));
        builder.add(Range.closed(15, 20));
        
        // Building the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Initialize an ImmutableSet with some values
        ImmutableSet<Integer> immutableSet = ImmutableSet.of(5, 10, 15, 25);
        
        // Print all elements in the ImmutableSet
        for (Integer value : immutableSet) {
            System.out.println("ImmutableSet contains: " + value);
        }
        
        // Initialize an ImmutableList with some values
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C", "D", "E");
        
        // Print all elements in the ImmutableList
        for (String value : immutableList) {
            System.out.println("ImmutableList contains: " + value);
        }
        
        // Perform some operations on ImmutableList
        String firstElement = immutableList.get(0);
        String lastElement = immutableList.get(immutableList.size() - 1);
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        
        // Adding more ranges to demonstrate complex usage
        builder.add(Range.closed(30, 40));
        builder.add(Range.open(50, 60));
        
        // Rebuild the rangeSet with additional ranges
        rangeSet = builder.build();
        
        // Check if the rangeSet contains a specific value
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("RangeSet contains 5: " + containsValue);
        
        // Perform some unrelated computations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Check for another value in the rangeSet
        boolean containsAnotherValue = rangeSet.contains(35);
        System.out.println("RangeSet contains 35: " + containsAnotherValue);
        
        // Perform some operations with ImmutableSet
        boolean isInSet = immutableSet.contains(10);
        System.out.println("ImmutableSet contains 10: " + isInSet);
    }
}