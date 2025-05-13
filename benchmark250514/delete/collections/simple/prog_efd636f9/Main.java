import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.PredicateUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a PredicatedBag with a predicate that allows all elements
        PredicatedBag<String> bag = new PredicatedBag<>(new HashBag<>(), PredicateUtils.truePredicate());

        /* write */ bag.add("apple");

        /* read */ int count = bag.getCount("apple");

        System.out.println(count);
    }
}