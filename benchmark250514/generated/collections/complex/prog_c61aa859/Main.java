import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all integers
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer object) {
                return object instanceof Integer;
            }
        };

        // Create a HashBag and wrap it with a PredicatedBag
        Bag<Integer> hashBag = new HashBag<>();
        PredicatedBag<Integer> predicatedBag = PredicatedBag.predicatedBag(hashBag, predicate);

        // Create another HashBag and PredicatedBag for demonstration
        Bag<String> stringBag = new HashBag<>();
        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return object instanceof String;
            }
        };
        PredicatedBag<String> predicatedStringBag = PredicatedBag.predicatedBag(stringBag, stringPredicate);

        // Add elements to the string PredicatedBag
        predicatedStringBag.add("Hello");
        predicatedStringBag.add("World");

        // Use a HashMap to store counts of words
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : predicatedStringBag.uniqueSet()) {
            wordCountMap.put(word, predicatedStringBag.getCount(word));
        }

        // Print word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* write */ predicatedBag.add(42);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Use the integer PredicatedBag
        for (int i = 0; i < 5; i++) {
            predicatedBag.add(i);
        }

        // Calculate total count of all integers in the bag
        int totalCount = 0;
        for (Integer number : predicatedBag.uniqueSet()) {
            totalCount += predicatedBag.getCount(number);
        }
        System.out.println("Total count of integers: " + totalCount);

        /* read */ int count = predicatedBag.getCount(42);
        System.out.println("Count of 42: " + count);
    }
}