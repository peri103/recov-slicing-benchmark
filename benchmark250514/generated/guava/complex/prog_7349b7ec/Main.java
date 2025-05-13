import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Create another ImmutableRangeSet with different ranges
        ImmutableRangeSet<Integer> anotherRangeSet = ImmutableRangeSet.<Integer>builder()
            .add(Range.closed(15, 20))
            .add(Range.closed(25, 30))
            .build();
        
        // Create an ImmutableSet of numbers
        ImmutableSet<Integer> numbers = ImmutableSet.of(5, 10, 15, 20, 25);
        
        // Iterate over the numbers and check their presence in the range sets
        for (Integer number : numbers) {
            boolean inRangeSet = rangeSet.contains(number);
            boolean inAnotherRangeSet = anotherRangeSet.contains(number);
            System.out.println("Number " + number + " in rangeSet: " + inRangeSet + ", in anotherRangeSet: " + inAnotherRangeSet);
        }
        
        // Check if a value is contained in the range set
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        // Print the result
        System.out.println("Contains 5 in original rangeSet: " + containsValue);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Create an ImmutableSet of strings
        ImmutableSet<String> strings = ImmutableSet.of("apple", "banana", "cherry");
        
        // Print each string in the set
        for (String str : strings) {
            System.out.println("String: " + str);
        }
    }
}