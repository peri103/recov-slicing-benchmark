import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all elements (no specific condition)
        Predicate<Object> predicate = obj -> true;

        // Create a HashBag instance
        Bag<Object> hashBag = new HashBag<>();

        // Wrap the HashBag with a PredicatedBag
        PredicatedBag<Object> predicatedBag = new PredicatedBag<>(hashBag, predicate);

        // Add an element to the PredicatedBag
        /* write */ predicatedBag.add("element");

        // Get the count of the added element
        /* read */ int count = predicatedBag.getCount("element");

        // Print the count
        System.out.println("Count of 'element': " + count);
    }
}