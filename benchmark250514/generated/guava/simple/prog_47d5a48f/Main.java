import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Define a range of integers
        Range<Integer> range = Range.closed(1, 10);
        // Create a ContiguousSet from the range
        /* write */ ContiguousSet<Integer> set = ContiguousSet.create(range, DiscreteDomain.integers());
        
        // Check if the set contains a specific value
        /* read */ boolean containsValue = set.contains(5);
        
        // Print the result
        System.out.println(containsValue);
    }
}