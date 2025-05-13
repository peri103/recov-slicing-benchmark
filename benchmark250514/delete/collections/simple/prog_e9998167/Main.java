import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Initialize a Predicate that accepts all elements
        Predicate<Object> predicate = new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
                return true;
            }
        };

        // Create a PredicatedBag using the HashBag implementation
        PredicatedBag<Object> bag = new PredicatedBag<>(new HashBag<>(), predicate);

        // Write operation: Add an element to the bag
        /* write */ bag.add("element");

        // Read operation: Get the count of the element added
        /* read */ int count = bag.getCount("element");

        // Output the count
        System.out.println(count);
    }
}