import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.bag.TreeBag;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all elements
        Predicate<Object> predicate = obj -> true;
        
        // Create a PredicatedBag with the predicate
        PredicatedBag<String> bag = new PredicatedBag<>(new HashBag<>(), predicate);
        
        // Create another bag with a different implementation
        TreeBag<Integer> integerBag = new TreeBag<>();
        
        // Add elements to the integerBag
        integerBag.add(10);
        integerBag.add(20);
        integerBag.add(30);
        
        // Perform some operations on integerBag
        System.out.println("Initial integerBag: " + integerBag);
        integerBag.remove(20);
        System.out.println("After removing 20: " + integerBag);
        
        // Use a loop to add multiple items to the original bag
        String[] items = {"apple", "banana", "cherry"};
        for (String item : items) {
            bag.add(item);
        }
        
        // Perform some operations on the original bag
        System.out.println("Initial bag: " + bag);
        
        /* write */ bag.add("example");
        
        // Check if the bag contains certain items
        boolean containsApple = bag.contains("apple");
        boolean containsBanana = bag.contains("banana");
        System.out.println("Contains apple: " + containsApple);
        System.out.println("Contains banana: " + containsBanana);
        
        // Sort and display elements in integerBag
        integerBag.addAll(Arrays.asList(5, 15, 25));
        System.out.println("Sorted integerBag: " + integerBag);
        
        // Calculate and display the number of occurrences of "example"
        /* read */ int count = bag.getCount("example");
        
        System.out.println("Count of 'example': " + count);
        
        // Perform additional operations to make the program more complex
        integerBag.clear();
        System.out.println("Cleared integerBag: " + integerBag);
        
        for (String item : items) {
            bag.remove(item);
        }
        System.out.println("Bag after removing items: " + bag);
    }
}