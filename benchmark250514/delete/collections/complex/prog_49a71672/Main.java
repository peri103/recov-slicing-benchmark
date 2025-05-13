import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;

public class Main {
    public static void main(String[] args) {
        // Create a HashBag as the base bag
        Bag<String> baseBag = new HashBag<>();

        // Use a TruePredicate to allow all elements
        Predicate<String> truePredicate = TruePredicate.truePredicate();

        // Create a PredicatedBag with the base bag and the predicate
        PredicatedBag<String> predicatedBag = new PredicatedBag<>(baseBag, truePredicate);

        // Add an element to the PredicatedBag
        /* write */ predicatedBag.add("example");

        // Create another PredicatedBag with a NotNullPredicate
        Predicate<String> notNullPredicate = NotNullPredicate.notNullPredicate();
        PredicatedBag<String> notNullBag = new PredicatedBag<>(new HashBag<>(), notNullPredicate);

        // Add multiple elements to the notNullBag
        notNullBag.add("item1");
        notNullBag.add("item2");
        notNullBag.add("item3");

        // Perform some operations on notNullBag
        int itemCount1 = notNullBag.getCount("item1");
        int itemCount2 = notNullBag.getCount("item2");
        int itemCount3 = notNullBag.getCount("item3");
        
        // Print the counts of items in notNullBag
        System.out.println("item1 count: " + itemCount1);
        System.out.println("item2 count: " + itemCount2);
        System.out.println("item3 count: " + itemCount3);

        // Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the count of the element added to predicatedBag
        /* read */ int count = predicatedBag.getCount("example");

        // Print the count
        System.out.println("Example count: " + count);
    }
}