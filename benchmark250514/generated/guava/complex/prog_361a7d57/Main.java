import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();
        TreeRangeSet<Integer> anotherRangeSet = TreeRangeSet.create();
        
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        anotherRangeSet.add(Range.closedOpen(20, 30));
        anotherRangeSet.add(Range.openClosed(40, 50));
        
        Set<Integer> numbersToCheck = new HashSet<>();
        for (int i = 0; i < 60; i += 5) {
            numbersToCheck.add(i);
        }
        
        for (Integer number : numbersToCheck) {
            if (anotherRangeSet.contains(number)) {
                System.out.println("Another range set contains: " + number);
            }
        }
        
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        System.out.println("Sum of even numbers up to 100: " + sum);
        
        /* read */ boolean contains = rangeSet.contains(5);
        
        System.out.println(contains); // This should print true since 5 is within the range 1-10
        
        for (int i = 1; i <= 10; i++) {
            if (rangeSet.contains(i)) {
                System.out.println("Range set contains: " + i);
            }
        }
        
        Set<Range<Integer>> allRanges = rangeSet.asRanges();
        for (Range<Integer> range : allRanges) {
            System.out.println("Range: " + range);
        }
    }
}