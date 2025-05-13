import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Define a predicate to allow all elements (no restrictions)
        Predicate<Object> predicate = obj -> true;

        // Create a base Bag and wrap it with a PredicatedBag
        Bag<String> baseBag = new HashBag<>();
        PredicatedBag<String> predicatedBag = new PredicatedBag<>(baseBag, predicate);

        // Another unrelated bag for additional complexity
        Bag<Integer> integerBag = new HashBag<>();
        integerBag.add(10);
        integerBag.add(20);
        integerBag.add(30);

        // Iterating and printing elements from the integerBag
        for (Integer element : integerBag) {
            System.out.println("Integer Bag Element: " + element);
        }

        // Adding unrelated elements to the baseBag
        baseBag.add("unrelated1");
        baseBag.add("unrelated2");

        /* write */ predicatedBag.add("example");

        // Perform operations unrelated to the original write-read pair
        baseBag.add("unrelated3");
        integerBag.add(40);
        System.out.println("Count of 'unrelated1': " + baseBag.getCount("unrelated1"));

        // Perform a computation
        int sum = 0;
        for (Integer element : integerBag) {
            sum += element;
        }
        System.out.println("Sum of Integer Bag Elements: " + sum);

        // Perform more operations unrelated to the original write-read pair
        baseBag.add("unrelated4");
        System.out.println("Count of 'unrelated4': " + baseBag.getCount("unrelated4"));

        /* read */ int count = predicatedBag.getCount("example");

        System.out.println(count);

        // Further unrelated operations
        baseBag.add("unrelated5");
        System.out.println("Count of 'unrelated5': " + baseBag.getCount("unrelated5"));

        // Print all elements in the baseBag
        for (String element : baseBag) {
            System.out.println("Base Bag Element: " + element);
        }
    }
}