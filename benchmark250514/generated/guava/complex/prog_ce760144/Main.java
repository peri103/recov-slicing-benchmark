import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableRangeSet containing a range from 1 to 10
        ImmutableRangeSet<Integer> rangeSet = /* write */ ImmutableRangeSet.of(Range.closed(1, 10));
        
        // Create a HashSet and add some values
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 15; i++) {
            hashSet.add(i);
        }
        
        // Perform some operations on HashSet
        for (Integer number : hashSet) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
        
        // Check if the range set contains the number 5
        boolean containsValue = /* read */ rangeSet.contains(5);
        
        // Print the result
        System.out.println("Does the range set contain the number 5? " + containsValue);
        
        // Additional operations on HashSet
        int sum = 0;
        for (Integer number : hashSet) {
            sum += number;
        }
        System.out.println("Sum of all numbers in HashSet: " + sum);
        
        // Create another ImmutableRangeSet with a different range
        ImmutableRangeSet<Integer> anotherRangeSet = ImmutableRangeSet.of(Range.closed(5, 15));
        
        // Check if the new range set contains the number 10
        boolean containsAnotherValue = anotherRangeSet.contains(10);
        System.out.println("Does the new range set contain the number 10? " + containsAnotherValue);
    }
}