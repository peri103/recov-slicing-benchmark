import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Create a predicate that always returns true (no filtering)
        Predicate<Object> truePredicate = object -> true;
        
        // Create a HashBag instance
        Bag<String> hashBag = new HashBag<>();
        
        // Wrap the HashBag with a PredicatedBag using the truePredicate
        PredicatedBag<String> predicatedBag = PredicatedBag.predicatedBag(hashBag, truePredicate);
        
        /* write */ predicatedBag.add("example");

        // Additional code to make the program more complex
        Bag<Integer> integerBag = new HashBag<>();
        integerBag.add(1);
        integerBag.add(2);
        integerBag.add(3);

        int sum = 0;
        for (Integer number : integerBag) {
            sum += number;
        }
        System.out.println("Sum of integers in integerBag: " + sum);

        Predicate<Integer> evenPredicate = number -> number % 2 == 0;
        PredicatedBag<Integer> evenBag = PredicatedBag.predicatedBag(integerBag, evenPredicate);
        evenBag.add(4); // This will be accepted
        // evenBag.add(5); // This will throw an exception due to the predicate

        int evenSum = 0;
        for (Integer number : evenBag) {
            evenSum += number;
        }
        System.out.println("Sum of even integers in evenBag: " + evenSum);

        /* read */ int count = predicatedBag.getCount("example");
        
        System.out.println(count);
    }
}