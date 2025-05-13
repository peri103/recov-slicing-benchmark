import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();
        ImmutableSet<Integer> immutableSet = ImmutableSet.of(3, 7, 9, 12, 15);

        // Add elements to the rangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));

        // Perform some operations on immutableSet
        for (Integer element : immutableSet) {
            System.out.println("Immutable set element: " + element);
        }

        // Check if certain numbers are within the range
        for (int i = 0; i <= 15; i++) {
            if (rangeSet.contains(i)) {
                System.out.println(i + " is within the range.");
            } else {
                System.out.println(i + " is outside the range.");
            }
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 1 to 5: " + sum);

        // Check if a specific number is in the range
        /* read */ boolean contains = rangeSet.contains(5);
        System.out.println("Does the range contain 5? " + contains);

        // More operations with TreeRangeSet
        rangeSet.add(Range.open(10, 20));
        System.out.println("Added new range: (10, 20)");

        // Perform some logic with the new range
        for (int i = 10; i <= 20; i++) {
            if (rangeSet.contains(i)) {
                System.out.println(i + " is within the new range.");
            }
        }
    }
}