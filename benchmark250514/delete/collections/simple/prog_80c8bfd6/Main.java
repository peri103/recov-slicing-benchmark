import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

public class Main {
    public static void main(String[] args) {
        // Create a predicate that always returns true
        Predicate<Object> truePredicate = TruePredicate.truePredicate();

        // Create a HashBag
        Bag<Object> hashBag = new HashBag<>();

        // Create a PredicatedBag using the true predicate
        PredicatedBag<Object> predicatedBag = new PredicatedBag<>(hashBag, truePredicate);

        // Write operation: Add an element to the bag
        /* write */ predicatedBag.add("exampleElement");

        // Read operation: Get the count of the element added
        /* read */ int count = predicatedBag.getCount("exampleElement");

        // Output the count
        System.out.println(count);
    }
}