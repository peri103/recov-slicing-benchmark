import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Define a predicate for the PredicatedBag
        Predicate<Object> predicate = obj -> obj instanceof Integer && (Integer) obj > 0;

        // Create a HashBag as the base bag
        Bag<Integer> baseBag = new HashBag<>();

        // Create a PredicatedBag using the base bag and the predicate
        PredicatedBag<Integer> predicatedBag = PredicatedBag.predicatedBag(baseBag, predicate);

        // Create an ArrayList and add some elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 2, 3, 4, 5);

        // Add elements from ArrayList to PredicatedBag
        for (Integer value : arrayList) {
            if (predicate.evaluate(value)) {
                predicatedBag.add(value);
            }
        }

        // Add a specific value to PredicatedBag
        /* write */ predicatedBag.add(5);

        // Perform operations on ArrayList
        int sum = 0;
        for (Integer value : arrayList) {
            sum += value;
        }
        System.out.println("Sum of ArrayList: " + sum);

        // Shuffle the ArrayList
        Collections.shuffle(arrayList);
        System.out.println("Shuffled ArrayList: " + arrayList);

        // Check the count of a specific element in PredicatedBag
        /* read */ int count = predicatedBag.getCount(5);

        // Output the count
        System.out.println("Count of 5 in PredicatedBag: " + count);

        // Perform additional operations on PredicatedBag
        for (Integer value : arrayList) {
            System.out.println("Count of " + value + " in PredicatedBag: " + predicatedBag.getCount(value));
        }
    }
}