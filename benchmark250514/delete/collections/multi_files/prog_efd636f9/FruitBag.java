import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.PredicateUtils;

public class FruitBag {
    private PredicatedBag<String> bag;

    public FruitBag() {
        this.bag = new PredicatedBag<>(new HashBag<>(), PredicateUtils.truePredicate());
    }

    public void addFruit(String fruit) {
        /* write */ bag.add(fruit);
    }

    public int getFruitCount(String fruit) {
        return bag.getCount(fruit);
    }
}