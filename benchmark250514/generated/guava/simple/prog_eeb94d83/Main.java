import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create an immutable collection using the 'of' method
        /* write */ ImmutableCollection<String> collection = ImmutableList.of("apple", "banana", "cherry");

        // Check if the collection contains the element "banana"
        /* read */ boolean containsBanana = collection.contains("banana");

        // Print the result
        System.out.println("Contains 'banana': " + containsBanana);
    }
}