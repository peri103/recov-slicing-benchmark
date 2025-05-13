import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Define a predicate to allow all elements (no restrictions)
        Predicate<Object> predicate = obj -> true;

        // Create a base Bag and wrap it with a PredicatedBag
        Bag<String> baseBag = new HashBag<>();
        PredicatedBag<String> predicatedBag = new PredicatedBag<>(baseBag, predicate);

        /* write */ predicatedBag.add("example");
        /* read */ int count = predicatedBag.getCount("example");

        System.out.println(count);
    }
}