import com.google.common.collect.HashMultiset;
import com.google.common.collect.LinkedHashMultiset;

public class Main {
    public static void main(String[] args) {
        HashMultiset<String> multiset = HashMultiset.create();
        LinkedHashMultiset<String> linkedMultiset = LinkedHashMultiset.create();

        // Add elements to linkedMultiset
        linkedMultiset.add("banana");
        linkedMultiset.add("banana");
        linkedMultiset.add("orange");

        // Print count of elements in linkedMultiset
        System.out.println("Banana count in linkedMultiset: " + linkedMultiset.count("banana"));
        System.out.println("Orange count in linkedMultiset: " + linkedMultiset.count("orange"));

        // Add elements to multiset
        /* write */ multiset.add("apple");

        // Perform some operations on multiset
        multiset.add("apple");
        multiset.add("apple");
        multiset.add("orange");
        multiset.add("banana");

        // Print counts of elements in multiset
        System.out.println("Apple count in multiset: " + multiset.count("apple"));
        System.out.println("Orange count in multiset: " + multiset.count("orange"));

        // Remove one apple from multiset
        multiset.remove("apple");

        // Check the count of apple after removal
        /* read */ int count = multiset.count("apple");
        System.out.println("Apple count after removal: " + count);

        // Add more operations
        multiset.add("grape");
        multiset.add("grape");
        multiset.add("grape");

        // Print count of grape
        System.out.println("Grape count in multiset: " + multiset.count("grape"));

        // Iterate and print all elements in multiset
        for (String element : multiset.elementSet()) {
            System.out.println("Element: " + element + ", Count: " + multiset.count(element));
        }
    }
}