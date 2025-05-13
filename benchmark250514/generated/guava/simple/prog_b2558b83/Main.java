import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Define a range of integers
        Range<Integer> range = Range.closed(1, 10);
        
        // Create a contiguous set within the defined range
        /* write */ ContiguousSet<Integer> set = ContiguousSet.create(range, DiscreteDomain.integers());
        
        // Check if a specific value is contained in the set
        /* read */ boolean containsValue = set.contains(5);
        
        // Output the result
        System.out.println("Contains 5: " + containsValue);
    }
}