import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

public class Main {
    public static void main(String[] args) {
        // Create a predicate that always returns true
        Predicate<Object> truePredicate = TruePredicate.truePredicate();
        
        // Create a HashBag as the decorated bag
        Bag<Object> hashBag = new HashBag<>();
        
        // Create a PredicatedBag with the true predicate
        PredicatedBag<Object> predicatedBag = new PredicatedBag<>(hashBag, truePredicate);

        // Write to the PredicatedBag
        /* write */ predicatedBag.add("example");

        // Read from the PredicatedBag
        /* read */ int count = predicatedBag.getCount("example");
        
        // Print the result
        System.out.println(count);
    }
}