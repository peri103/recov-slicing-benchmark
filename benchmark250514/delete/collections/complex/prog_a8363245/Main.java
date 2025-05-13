import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.bag.TreeBag;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all elements
        Predicate<Object> predicate = obj -> true;

        // Create a base bag
        Bag<Object> baseBag = new HashBag<>();

        // Wrap the base bag with the PredicatedBag
        PredicatedBag<Object> predicatedBag = new PredicatedBag<>(baseBag, predicate);

        /* write */ predicatedBag.add("example");

        // Create another bag for demonstration
        Bag<String> treeBag = new TreeBag<>();
        treeBag.add("apple");
        treeBag.add("banana");
        treeBag.add("orange");

        // Add multiple elements to the base bag
        baseBag.addAll(Arrays.asList("one", "two", "three"));

        // Manipulate the treeBag
        for (String fruit : treeBag) {
            System.out.println("Fruit: " + fruit);
        }

        // Add elements to the treeBag
        treeBag.add("grape");
        treeBag.add("kiwi");

        // Check counts in treeBag
        for (String fruit : Arrays.asList("apple", "banana", "grape")) {
            System.out.println(fruit + " count: " + treeBag.getCount(fruit));
        }

        // Perform some operations on baseBag
        System.out.println("BaseBag size before clear: " + baseBag.size());
        baseBag.clear();
        System.out.println("BaseBag size after clear: " + baseBag.size());

        // Finally read the count from the PredicatedBag
        /* read */ int count = predicatedBag.getCount("example");
        System.out.println(count);
    }
}