import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;

public class Main {
    public static void main(String[] args) {
        // Create a HashBag which is a concrete implementation of Bag
        Bag<String> hashBag = new HashBag<>();

        // Create a PredicatedBag with a predicate that always returns true (allowing all elements)
        Predicate<String> truePredicate = TruePredicate.truePredicate();
        PredicatedBag<String> predicatedBag = PredicatedBag.predicatedBag(hashBag, truePredicate);

        // Add an element to the PredicatedBag
        /* write */ predicatedBag.add("element");

        // Create another PredicatedBag with a predicate that disallows null elements
        Predicate<Object> notNullPredicate = NotNullPredicate.notNullPredicate();
        PredicatedBag<Object> nonNullBag = PredicatedBag.predicatedBag(new HashBag<>(), notNullPredicate);

        // Add elements to the nonNullBag
        nonNullBag.add("first");
        nonNullBag.add("second");

        // Perform operations on nonNullBag
        int firstCount = nonNullBag.getCount("first");
        System.out.println("Count of 'first': " + firstCount);

        // Iterate over elements in nonNullBag
        for (Object obj : nonNullBag) {
            System.out.println("Element in nonNullBag: " + obj);
        }

        // Read the count of the added element from the PredicatedBag
        /* read */ int count = predicatedBag.getCount("element");

        // Print the count
        System.out.println("Count of 'element': " + count);

        // Add more elements to hashBag directly
        hashBag.add("anotherElement");
        hashBag.add("anotherElement");

        // Print the count of another element
        int anotherCount = hashBag.getCount("anotherElement");
        System.out.println("Count of 'anotherElement': " + anotherCount);
    }
}