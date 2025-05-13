import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all elements
        Predicate<Object> predicate = obj -> true;

        // Create a base bag
        Bag<Object> baseBag = new HashBag<>();

        // Wrap the base bag with the PredicatedBag
        PredicatedBag<Object> predicatedBag = new PredicatedBag<>(baseBag, predicate);

        /* write */ predicatedBag.add("example");
        /* read */ int count = predicatedBag.getCount("example");

        System.out.println(count);
    }
}