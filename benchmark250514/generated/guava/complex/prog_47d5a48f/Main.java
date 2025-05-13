import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Define a range of integers
        Range<Integer> range = Range.closed(1, 10);
        // Create a ContiguousSet from the range
        /* write */ ContiguousSet<Integer> set = ContiguousSet.create(range, DiscreteDomain.integers());
        
        // Perform operations on a different set
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 5; i <= 15; i++) {
            hashSet.add(i);
        }
        
        // Create an ImmutableSet from the HashSet
        ImmutableSet<Integer> immutableSet = ImmutableSet.copyOf(hashSet);
        System.out.println("ImmutableSet contains:");
        for (Integer num : immutableSet) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Check if the original ContiguousSet contains a specific value
        /* read */ boolean containsValue = set.contains(5);
        
        // Perform further operations on another set
        Set<Integer> combinedSet = new HashSet<>(set);
        combinedSet.addAll(immutableSet);
        
        System.out.println("Combined Set contains:");
        for (Integer num : combinedSet) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Print the result of the original read operation
        System.out.println("Original set contains 5: " + containsValue);
    }
}