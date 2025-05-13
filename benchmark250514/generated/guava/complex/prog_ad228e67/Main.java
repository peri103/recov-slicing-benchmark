import com.google.common.collect.TreeMultiset;
import com.google.common.collect.HashMultiset;

public class Main {
    public static void main(String[] args) {
        TreeMultiset<String> multiset = TreeMultiset.create();
        HashMultiset<String> hashMultiset = HashMultiset.create();

        // Adding elements to HashMultiset
        hashMultiset.add("banana");
        hashMultiset.add("banana");
        hashMultiset.add("orange");

        // Perform some operations on HashMultiset
        int bananaCount = hashMultiset.count("banana");
        System.out.println("Banana count in HashMultiset: " + bananaCount);

        // Add elements to TreeMultiset
        /* write */ multiset.add("apple");

        // Perform some operations on TreeMultiset
        multiset.add("orange");
        multiset.add("banana");
        multiset.add("banana");

        int orangeCount = multiset.count("orange");
        System.out.println("Orange count in TreeMultiset: " + orangeCount);

        // More operations on HashMultiset
        hashMultiset.remove("banana");
        System.out.println("Banana count after removal: " + hashMultiset.count("banana"));

        // Retrieve the count for "apple" from TreeMultiset
        /* read */ int appleCount = multiset.count("apple");
        System.out.println("Apple count in TreeMultiset: " + appleCount);

        // Iterate over elements in TreeMultiset
        for (String element : multiset.elementSet()) {
            System.out.println(element + ": " + multiset.count(element));
        }
    }
}