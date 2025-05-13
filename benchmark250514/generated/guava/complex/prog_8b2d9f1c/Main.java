import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        Set<Integer> set = new HashSet<>();

        // Adding some initial values to the HashSet
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }

        // Perform some operations on the HashSet
        set.remove(5);
        set.add(20);

        // Adding a range to the RangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));

        // Perform some calculations
        int sum = 0;
        for (int num : set) {
            sum += num;
        }
        System.out.println("Sum of elements in set: " + sum);

        // Further manipulation of the HashSet
        set.remove(20);
        set.add(15);

        // Check if a number is contained in the RangeSet
        /* read */ boolean contains = rangeSet.contains(5);
        System.out.println("RangeSet contains 5: " + contains);

        // Additional operations on the RangeSet
        rangeSet.add(Range.closed(15, 20));
        boolean contains15 = rangeSet.contains(15);
        System.out.println("RangeSet contains 15: " + contains15);

        // Further calculations and print statements
        int product = 1;
        for (int num : set) {
            product *= num;
        }
        System.out.println("Product of elements in set: " + product);
    }
}