import com.google.common.collect.ForwardingSortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize a TreeSet to be wrapped by ForwardingSortedSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Create an anonymous class extending ForwardingSortedSet
        ForwardingSortedSet<Integer> forwardingSortedSet = new ForwardingSortedSet<Integer>() {
            @Override
            protected TreeSet<Integer> delegate() {
                return treeSet;
            }
        };

        // Create a HashSet to demonstrate additional complexity
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        // Add elements to the ForwardingSortedSet
        forwardingSortedSet.addAll(hashSet);

        // Perform some operations on the HashSet
        hashSet.remove(10);
        hashSet.add(40);

        // Iterate over the HashSet and perform operations on ForwardingSortedSet
        for (Integer number : hashSet) {
            if (number % 2 == 0) {
                forwardingSortedSet.add(number);
            }
        }

        /* write */ forwardingSortedSet.add(42);

        // Perform more operations on the ForwardingSortedSet
        if (forwardingSortedSet.size() > 3) {
            forwardingSortedSet.remove(20);
        }

        // Calculate and print the sum of elements in the ForwardingSortedSet
        int sum = 0;
        for (Integer num : forwardingSortedSet) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        /* read */ boolean containsValue = forwardingSortedSet.contains(42);
        System.out.println("Contains 42: " + containsValue);

        // Perform another operation on the ForwardingSortedSet
        forwardingSortedSet.clear();
        System.out.println("Size after clear: " + forwardingSortedSet.size());
    }
}