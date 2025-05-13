import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for the ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Initialize a TreeRangeSet for additional complexity
        RangeSet<Integer> treeRangeSet = TreeRangeSet.create();
        
        // Add ranges to the TreeRangeSet
        treeRangeSet.add(Range.closed(20, 30));
        treeRangeSet.add(Range.open(40, 50));
        
        // Perform some operations on the TreeRangeSet
        boolean containsInTreeRangeSet = treeRangeSet.contains(25);
        System.out.println("TreeRangeSet contains 25: " + containsInTreeRangeSet);
        
        // Perform a union operation for demonstration
        RangeSet<Integer> unionRangeSet = TreeRangeSet.create();
        unionRangeSet.addAll(treeRangeSet);
        unionRangeSet.add(Range.closed(60, 70));
        
        // Check if a value is contained in the union range set
        boolean containsInUnionRangeSet = unionRangeSet.contains(65);
        System.out.println("UnionRangeSet contains 65: " + containsInUnionRangeSet);
        
        // Check if a value is contained in the original ImmutableRangeSet
        /* read */ boolean contains = rangeSet.contains(5);
        
        // Print the result
        System.out.println("ImmutableRangeSet contains 5: " + contains);
    }
}