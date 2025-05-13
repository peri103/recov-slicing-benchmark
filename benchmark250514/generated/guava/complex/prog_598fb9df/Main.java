import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();
        Set<Integer> numberSet = new HashSet<>();
        
        // Add numbers to the HashSet
        for (int i = 0; i < 20; i++) {
            numberSet.add(i);
        }
        
        // Add a range to the TreeRangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        // Check if a number is in the HashSet
        boolean isInSet = numberSet.contains(5);
        System.out.println("Number 5 in HashSet: " + isInSet);
        
        // Perform some operations with the HashSet
        numberSet.remove(5);
        numberSet.add(21);
        
        // More complex logic with TreeRangeSet
        boolean isSubset = rangeSet.subRangeSet(Range.closed(1, 5)).encloses(Range.closed(2, 3));
        System.out.println("Is subrange enclosed: " + isSubset);
        
        // Check if a number is in the TreeRangeSet
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("Number 5 in TreeRangeSet: " + containsValue);
        
        // Further operations with the TreeRangeSet
        rangeSet.remove(Range.closed(5, 10));
        boolean containsAfterRemoval = rangeSet.contains(5);
        System.out.println("Number 5 in TreeRangeSet after removal: " + containsAfterRemoval);
    }
}