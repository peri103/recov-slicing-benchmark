import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Create a predicate that allows all elements
        Predicate<Object> allElementsPredicate = new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
                return true;
            }
        };

        // Initialize a PredicatedBag with a HashBag and the predicate
        PredicatedBag<Object> bag = new PredicatedBag<>(new HashBag<>(), allElementsPredicate);

        // Add an element to the bag
        /* write */ bag.add("element");

        // Read the count of the added element
        /* read */ int count = bag.getCount("element");

        // Print the count
        System.out.println(count);
    }
}