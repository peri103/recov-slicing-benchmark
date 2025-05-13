import com.google.common.collect.ForwardingSortedSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> baseSet = new TreeSet<>();
        ForwardingSortedSet<Integer> forwardingSet = new ForwardingSortedSet<Integer>() {
            @Override
            protected SortedSet<Integer> delegate() {
                return baseSet;
            }
        };

        // Additional code to make the program more complex
        SortedSet<Integer> anotherSet = new TreeSet<>();
        anotherSet.add(100);
        anotherSet.add(200);
        anotherSet.add(300);
        
        // Add elements from anotherSet to forwardingSet
        for (Integer num : anotherSet) {
            forwardingSet.add(num);
        }

        // Perform some operations on forwardingSet
        int sum = 0;
        for (Integer num : forwardingSet) {
            sum += num;
        }
        System.out.println("Sum of elements in forwardingSet: " + sum);

        /* write */ forwardingSet.add(42);

        // Perform some more operations on forwardingSet
        int max = 0;
        for (Integer num : forwardingSet) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max element in forwardingSet: " + max);

        /* read */ boolean containsValue = forwardingSet.contains(42);
        System.out.println("Does forwardingSet contain 42? " + containsValue);

        // Additional complexity: find the smallest element
        int min = Integer.MAX_VALUE;
        for (Integer num : forwardingSet) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min element in forwardingSet: " + min);
    }
}