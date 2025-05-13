import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ForwardingList;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an anonymous class extending ForwardingSet
        ForwardingSet<Integer> set = new ForwardingSet<Integer>() {
            private final Set<Integer> delegate = new HashSet<Integer>();

            @Override
            protected Set<Integer> delegate() {
                return delegate;
            }
        };

        // Create an anonymous class extending ForwardingList
        ForwardingList<String> list = new ForwardingList<String>() {
            private final List<String> delegate = new ArrayList<String>();

            @Override
            protected List<String> delegate() {
                return delegate;
            }
        };

        /* write */ set.add(42); // Use the add method to write the value

        // Add elements to the list
        list.add("Hello");
        list.add("World");
        list.add("!");

        // Iterate over the list and print each element
        for (String s : list) {
            System.out.println(s);
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Use a different ForwardingSet to demonstrate similar functionality
        ForwardingSet<String> stringSet = new ForwardingSet<String>() {
            private final Set<String> delegate = new HashSet<String>();

            @Override
            protected Set<String> delegate() {
                return delegate;
            }
        };

        stringSet.add("Apple");
        stringSet.add("Banana");

        // Check if elements are in the stringSet
        System.out.println("Contains Apple: " + stringSet.contains("Apple"));
        System.out.println("Contains Banana: " + stringSet.contains("Banana"));

        /* read */ boolean containsValue = set.contains(42); // Use the contains method to read the value

        System.out.println("Contains 42: " + containsValue);

        // More unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 100);
        }

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}