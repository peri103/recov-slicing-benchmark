import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Create a predicate that allows all elements
        Predicate<Object> predicate = new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
                return true;
            }
        };

        // Create a HashBag and wrap it with PredicatedBag using the predicate
        HashBag<Object> hashBag = new HashBag<>();
        PredicatedBag<Object> predicatedBag = PredicatedBag.predicatedBag(hashBag, predicate);

        /* write */ predicatedBag.add("example");

        /* read */ int count = predicatedBag.getCount("example");
        System.out.println(count);
    }
}