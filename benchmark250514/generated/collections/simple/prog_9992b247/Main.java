import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all elements
        Predicate<Object> predicate = obj -> true;

        // Create a HashBag and wrap it with a PredicatedBag
        Bag<Object> hashBag = new HashBag<>();
        PredicatedBag<Object> predicatedBag = PredicatedBag.predicatedBag(hashBag, predicate);

        /* write */ predicatedBag.add("exampleElement");

        /* read */ int count = predicatedBag.getCount("exampleElement");
        System.out.println(count);
    }
}