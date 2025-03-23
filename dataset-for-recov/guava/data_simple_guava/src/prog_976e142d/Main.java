import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        /* write */ rangeSet.add(com.google.common.collect.Range.closed(1, 5));
        /* read */ boolean containsValue = rangeSet.contains(3);
        System.out.println("RangeSet contains 3: " + containsValue);
    }
}