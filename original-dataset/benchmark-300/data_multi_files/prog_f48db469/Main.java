import java.util.TreeSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        TreeSetOperations treeSetOps = new TreeSetOperations();
        HashSetOperations hashSetOps = new HashSetOperations();

        // Add random values to the HashSet
        hashSetOps.addRandomValues(10);

        // Add a specific value to the TreeSet
        treeSetOps.addValue(42);

        // Perform some operations on the HashSet
        HashSet<Integer> hashSet = hashSetOps.getHashSet();
        TreeSet<Integer> set = treeSetOps.getSet();
        for (Integer value : hashSet) {
            if (value % 2 == 0) {
                set.add(value);
            }
        }

        // Check if the TreeSet contains the specific value
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Does the TreeSet contain 42? " + containsValue);

        // Print all values in the TreeSet
        System.out.println("Values in the TreeSet:");
        for (Integer value : set) {
            System.out.println(value);
        }

        // Perform some additional operations
        int sum = 0;
        for (Integer value : hashSet) {
            sum += value;
        }
        System.out.println("Sum of values in the HashSet: " + sum);
    }
}