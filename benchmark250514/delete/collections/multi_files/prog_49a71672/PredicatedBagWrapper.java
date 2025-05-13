import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

public class PredicatedBagWrapper {
    private PredicatedBag<String> predicatedBag;

    public PredicatedBagWrapper() {
        Bag<String> baseBag = new HashBag<>();
        Predicate<String> truePredicate = TruePredicate.truePredicate();
        this.predicatedBag = new PredicatedBag<>(baseBag, truePredicate);
    }

    public void addElement(String element) {
        /* write */ predicatedBag.add(element);
    }

    public int getElementCount(String element) {
        return predicatedBag.getCount(element);
    }
}
