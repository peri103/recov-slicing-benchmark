import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;

public class BagOperations {
    private PredicatedBag<Object> predicatedBag;

    public BagOperations() {
        // Define a predicate that allows all elements
        Predicate<Object> predicate = obj -> true;
        // Create a base bag and wrap it with the PredicatedBag
        Bag<Object> baseBag = new HashBag<>();
        predicatedBag = new PredicatedBag<>(baseBag, predicate);
    }

    public void addElement(Object element) {
        /* write */ predicatedBag.add(element);
    }

    public PredicatedBag<Object> getPredicatedBag() {
        return predicatedBag;
    }
}
