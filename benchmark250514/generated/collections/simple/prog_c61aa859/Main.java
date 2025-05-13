import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all integers
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer object) {
                return object instanceof Integer;
            }
        };

        // Create a HashBag and wrap it with a PredicatedBag
        Bag<Integer> hashBag = new HashBag<>();
        PredicatedBag<Integer> predicatedBag = PredicatedBag.predicatedBag(hashBag, predicate);

        /* write */ predicatedBag.add(42);

        /* read */ int count = predicatedBag.getCount(42);
        System.out.println(count);
    }
}