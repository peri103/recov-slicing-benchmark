import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.ImmutableRangeSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        /* write */ rangeSet.add(Range.closed(1, 10));

        // Additional code to make the program more complex
        RangeSet<Integer> anotherRangeSet = TreeRangeSet.create();
        anotherRangeSet.add(Range.closed(20, 30));
        anotherRangeSet.add(Range.open(15, 25));
        
        ImmutableRangeSet<Integer> immutableRangeSet = ImmutableRangeSet.copyOf(anotherRangeSet);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < 40; i++) {
            if (immutableRangeSet.contains(i)) {
                numbers.add(i);
            }
        }

        for (Integer number : numbers) {
            System.out.println("Number in immutable range set: " + number);
        }

        // Continue with the original read operation
        /* read */ boolean containsFive = rangeSet.contains(5);
        System.out.println("Does the range set contain 5? " + containsFive);

        // Additional unrelated code
        RangeSet<Integer> yetAnotherRangeSet = TreeRangeSet.create();
        yetAnotherRangeSet.add(Range.closedOpen(50, 60));
        yetAnotherRangeSet.add(Range.openClosed(70, 80));

        for (int i = 45; i < 85; i += 5) {
            if (yetAnotherRangeSet.contains(i)) {
                System.out.println("Yet another range set contains: " + i);
            }
        }
    }
}