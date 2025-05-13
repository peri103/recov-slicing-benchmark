import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

public class Main {
    public static void main(String[] args) {
        // Create a HashBag which is a concrete implementation of Bag
        Bag<String> hashBag = new HashBag<>();

        // Create a PredicatedBag with a predicate that always returns true (allowing all elements)
        Predicate<String> truePredicate = TruePredicate.truePredicate();
        PredicatedBag<String> predicatedBag = PredicatedBag.predicatedBag(hashBag, truePredicate);

        // Add an element to the PredicatedBag
        /* write */ predicatedBag.add("element");

        // Read the count of the added element from the PredicatedBag
        /* read */ int count = predicatedBag.getCount("element");

        // Print the count
        System.out.println(count);
    }
}