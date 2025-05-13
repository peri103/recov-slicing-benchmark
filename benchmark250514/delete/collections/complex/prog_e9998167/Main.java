import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.bag.TreeBag;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Predicate that accepts all elements
        Predicate<Object> predicate = new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
                return true;
            }
        };

        // Create a PredicatedBag using the HashBag implementation
        PredicatedBag<Object> bag = new PredicatedBag<>(new HashBag<>(), predicate);

        // Write operation: Add an element to the bag
        /* write */ bag.add("element");

        // Introduce a new TreeBag and perform operations
        TreeBag<String> treeBag = new TreeBag<>();
        treeBag.add("apple");
        treeBag.add("banana");
        treeBag.add("apple");
        System.out.println("Count of 'apple' in TreeBag: " + treeBag.getCount("apple"));

        // Create an ArrayList and perform operations
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        System.out.println("ArrayList element at index 1: " + list.get(1));

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 0 to 9: " + sum);

        // Read operation: Get the count of the element added
        /* read */ int count = bag.getCount("element");

        // Output the count
        System.out.println("Count of 'element' in PredicatedBag: " + count);

        // Perform more operations on TreeBag
        treeBag.add("orange");
        System.out.println("Count of 'orange' in TreeBag: " + treeBag.getCount("orange"));

        // Perform operations on ArrayList
        list.add("fourth");
        System.out.println("ArrayList element at index 3: " + list.get(3));
    }
}