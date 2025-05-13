import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Define a predicate for the PredicatedBag
        Predicate<Object> predicate = obj -> obj instanceof Integer && (Integer) obj > 0;

        // Create a HashBag as the base bag
        Bag<Integer> baseBag = new HashBag<>();

        // Create a PredicatedBag using the base bag and the predicate
        PredicatedBag<Integer> predicatedBag = PredicatedBag.predicatedBag(baseBag, predicate);

        /* write */ predicatedBag.add(5);

        /* read */ int count = predicatedBag.getCount(5);

        // Output the count
        System.out.println("Count of 5: " + count);
    }
}