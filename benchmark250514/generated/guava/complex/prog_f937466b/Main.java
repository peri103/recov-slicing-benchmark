import com.google.common.collect.ImmutableSortedSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Initializing a HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(7);

        // Initializing a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        treeSet.add(2);
        treeSet.add(10);

        // Creating an ImmutableSortedSet using a builder
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.<Integer>naturalOrder();
        /* write */ builder.add(1);
        
        // Adding more elements using the builder
        builder.add(4).add(6).add(8);
        ImmutableSortedSet<Integer> sortedSet = builder.build();

        // Simulate some operations
        int sum = 0;
        for (Integer num : treeSet) {
            sum += num;
        }
        System.out.println("Sum of TreeSet: " + sum);

        // Some other operations on HashSet
        if (hashSet.contains(5)) {
            hashSet.remove(5);
        }
        System.out.println("HashSet after removal: " + hashSet);

        // Check if the sortedSet contains the element
        /* read */ boolean containsValue = sortedSet.contains(1);
        System.out.println("ImmutableSortedSet contains 1: " + containsValue);

        // More operations on TreeSet
        for (Integer num : sortedSet) {
            if (!treeSet.contains(num)) {
                treeSet.add(num);
            }
        }
        System.out.println("TreeSet after merging: " + treeSet);
    }
}