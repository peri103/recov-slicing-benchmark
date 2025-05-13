import com.google.common.collect.ForwardingSortedSet;
import com.google.common.collect.ForwardingList;
import java.util.TreeSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the ForwardingSortedSet with a TreeSet
        ForwardingSortedSet<Integer> set = new ForwardingSortedSet<Integer>() {
            private final TreeSet<Integer> delegate = new TreeSet<>();

            @Override
            protected TreeSet<Integer> delegate() {
                return delegate;
            }
        };

        // Initialize another collection for unrelated operations
        ForwardingList<String> stringList = new ForwardingList<String>() {
            private final ArrayList<String> delegate = new ArrayList<>();

            @Override
            protected ArrayList<String> delegate() {
                return delegate;
            }
        };

        // Perform operations on the ForwardingList
        stringList.add("Hello");
        stringList.add("World");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            if (i % 2 == 0) {
                stringList.add("Even " + i);
            }
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Write operation on the ForwardingSortedSet
        /* write */ set.add(42);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Read operation on the ForwardingSortedSet
        /* read */ boolean contains = set.contains(42);
        System.out.println("Does the set contain 42? " + contains);

        // Additional operations on the ForwardingSortedSet
        set.add(100);
        set.add(200);
        System.out.println("Set size: " + set.size());
        for (Integer number : set) {
            System.out.println("Number in set: " + number);
        }
    }
}