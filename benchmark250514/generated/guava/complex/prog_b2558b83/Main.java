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

        // Create a contiguous set within the defined range
        /* write */ ContiguousSet<Integer> set = ContiguousSet.create(range, DiscreteDomain.integers());

        // Create another set using ImmutableSet
        ImmutableSet<Integer> immutableSet = ImmutableSet.of(1, 2, 3, 4, 5);

        // Perform some operations on the immutable set
        Set<Integer> hashSet = new HashSet<>(immutableSet);
        hashSet.add(6);
        hashSet.remove(2);

        // Output the contents of the hashSet
        System.out.println("HashSet contents: " + hashSet);

        // Calculate and print the sum of the elements in the hashSet
        int sum = hashSet.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of HashSet: " + sum);

        // Check if a specific value is contained in the contiguous set
        /* read */ boolean containsValue = set.contains(5);

        // Output the result
        System.out.println("Contains 5 in ContiguousSet: " + containsValue);

        // Create a new range and contiguous set
        Range<Integer> newRange = Range.closed(20, 30);
        ContiguousSet<Integer> newSet = ContiguousSet.create(newRange, DiscreteDomain.integers());

        // Check if a specific value is contained in the new contiguous set
        boolean newContainsValue = newSet.contains(25);

        // Output the result
        System.out.println("Contains 25 in New ContiguousSet: " + newContainsValue);
    }
}