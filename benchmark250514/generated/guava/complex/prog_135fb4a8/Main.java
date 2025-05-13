import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        hashSet.add(20);

        /* write */ builder.add(5);

        treeSet.add(15);
        hashSet.add(25);

        ImmutableSortedSet<Integer> set = builder.build();

        // Perform operations on hashSet
        hashSet.add(30);
        hashSet.remove(20);
        treeSet.addAll(hashSet);

        // Perform operations on treeSet
        treeSet.remove(10);
        treeSet.add(5);

        /* read */ boolean containsValue = set.contains(5);
        System.out.println(containsValue);

        // Additional operations
        for (Integer value : treeSet) {
            System.out.println("TreeSet value: " + value);
        }

        for (Integer value : hashSet) {
            System.out.println("HashSet value: " + value);
        }
    }
}