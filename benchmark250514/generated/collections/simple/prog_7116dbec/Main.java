import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Create a predicate that always returns true (no filtering)
        Predicate<Object> truePredicate = object -> true;
        
        // Create a HashBag instance
        Bag<String> hashBag = new HashBag<>();
        
        // Wrap the HashBag with a PredicatedBag using the truePredicate
        PredicatedBag<String> predicatedBag = PredicatedBag.predicatedBag(hashBag, truePredicate);
        
        /* write */ predicatedBag.add("example");

        /* read */ int count = predicatedBag.getCount("example");
        
        System.out.println(count);
    }
}