import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.ImmutableRangeSet;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        RangeSet<Integer> anotherRangeSet = TreeRangeSet.create();
        
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        anotherRangeSet.add(Range.closedOpen(15, 20));
        anotherRangeSet.add(Range.openClosed(25, 30));
        
        boolean containsInAnother = anotherRangeSet.contains(18);
        System.out.println("Another RangeSet contains 18: " + containsInAnother);
        
        RangeSet<Integer> immutableRangeSet = ImmutableRangeSet.copyOf(rangeSet);
        boolean containsInImmutable = immutableRangeSet.contains(7);
        System.out.println("Immutable RangeSet contains 7: " + containsInImmutable);
        
        for (int i = 0; i <= 35; i += 5) {
            boolean contains = rangeSet.contains(i);
            System.out.println("RangeSet contains " + i + ": " + contains);
        }
        
        /* read */ boolean contains = rangeSet.contains(5);
        System.out.println("Original RangeSet contains 5: " + contains);
        
        RangeSet<Integer> mergedRangeSet = TreeRangeSet.create();
        mergedRangeSet.addAll(rangeSet);
        mergedRangeSet.addAll(anotherRangeSet);
        
        for (int i = 0; i <= 35; i += 5) {
            boolean containsInMerged = mergedRangeSet.contains(i);
            System.out.println("Merged RangeSet contains " + i + ": " + containsInMerged);
        }
    }
}