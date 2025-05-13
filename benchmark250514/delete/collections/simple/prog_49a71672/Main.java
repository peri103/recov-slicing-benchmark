import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

public class Main {
    public static void main(String[] args) {
        // Create a HashBag as the base bag
        Bag<String> baseBag = new HashBag<>();

        // Use a TruePredicate to allow all elements
        Predicate<String> predicate = TruePredicate.truePredicate();

        // Create a PredicatedBag with the base bag and the predicate
        PredicatedBag<String> predicatedBag = new PredicatedBag<>(baseBag, predicate);

        // Add an element to the PredicatedBag
        /* write */ predicatedBag.add("example");

        // Read the count of the element added
        /* read */ int count = predicatedBag.getCount("example");

        // Print the count
        System.out.println(count);
    }
}