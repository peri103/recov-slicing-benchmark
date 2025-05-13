import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();
        Set<Integer> numberSet = new HashSet<>();
        
        // Initializing the HashSet with some numbers
        for (int i = 1; i <= 15; i++) {
            numberSet.add(i);
        }
        
        // Adding a range to the TreeRangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        // Performing operations on the HashSet
        numberSet.remove(3);
        numberSet.add(20);
        
        // Checking if specific numbers are within the range
        boolean containsFive = rangeSet.contains(5);
        boolean containsEleven = rangeSet.contains(11);
        
        // Printing out the status of range checks
        System.out.println("RangeSet contains 5: " + containsFive);
        System.out.println("RangeSet contains 11: " + containsEleven);
        
        // More complex operations with the numberSet
        int sum = 0;
        for (Integer number : numberSet) {
            sum += number;
        }
        
        System.out.println("Sum of numbers in HashSet: " + sum);
        
        // Additional operations on TreeRangeSet
        boolean containsValue;
        for (int i = 0; i < 3; i++) {
            int checkValue = i * 5;
            containsValue = rangeSet.contains(checkValue);
            System.out.println("RangeSet contains " + checkValue + ": " + containsValue);
        }
        
        // Final read operation
        /* read */ containsValue = rangeSet.contains(5);
        
        System.out.println("Final check, RangeSet contains 5: " + containsValue);
    }
}