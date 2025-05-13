import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Initialize numbers list
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        
        // Add ranges to rangeSet
        rangeSet.add(Range.closed(15, 25));
        rangeSet.add(Range.closed(30, 40));
        
        // Process numbers and check if they are within any range
        for (Integer num : numbers) {
            if (rangeSet.contains(num)) {
                System.out.println(num + " is within a range.");
            } else {
                System.out.println(num + " is not within any range.");
            }
        }
        
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        // Calculate sum of numbers within the newly added range
        int sum = 0;
        for (Integer num : numbers) {
            if (rangeSet.contains(num)) {
                sum += num;
            }
        }
        
        System.out.println("Sum of numbers within the new range: " + sum);
        
        // Perform some operations on the numbers list
        int product = 1;
        for (int i = 0; i < numbers.size(); i += 2) {
            product *= numbers.get(i);
        }
        
        System.out.println("Product of numbers at even indices: " + product);
        
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        System.out.println("Does the range set contain 5? " + containsValue);
        
        // Further operations on the rangeSet
        rangeSet.add(Range.closed(50, 60));
        rangeSet.add(Range.closed(70, 80));
        
        for (int i = 50; i <= 80; i += 10) {
            if (rangeSet.contains(i)) {
                System.out.println(i + " is within a newly added range.");
            }
        }
    }
}