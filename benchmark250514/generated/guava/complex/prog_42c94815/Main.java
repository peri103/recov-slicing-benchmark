import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableRangeSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        RangeSet<Integer> anotherRangeSet = TreeRangeSet.create();
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, RangeSet<Integer>> rangeMap = new HashMap<>();

        // Adding ranges to rangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));
        anotherRangeSet.add(Range.openClosed(10, 20));
        rangeMap.put("firstRange", rangeSet);
        rangeMap.put("secondRange", anotherRangeSet);

        // Adding numbers to ArrayList
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        // Performing operations on numbers
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Retrieving range from map and checking containment
        RangeSet<Integer> retrievedRangeSet = rangeMap.get("firstRange");
        boolean containsValue = retrievedRangeSet.contains(5);  // Using the original read method
        /* read */ System.out.println("Does the range contain 5? " + containsValue);

        // Additional operations
        RangeSet<Integer> immutableRangeSet = ImmutableRangeSet.copyOf(retrievedRangeSet);
        boolean containsInImmutable = immutableRangeSet.contains(8);
        System.out.println("Does the immutable range contain 8? " + containsInImmutable);

        // Further manipulation
        rangeSet.add(Range.closedOpen(20, 30));
        boolean containsTwentyFive = rangeSet.contains(25);
        System.out.println("Does the range contain 25? " + containsTwentyFive);
    }
}