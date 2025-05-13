import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an immutable collection using the 'of' method
        /* write */ ImmutableCollection<String> collection = ImmutableList.of("apple", "banana", "cherry");

        // Create a map to store fruits and their colors
        Map<String, String> fruitColors = new HashMap<>();
        fruitColors.put("apple", "red");
        fruitColors.put("banana", "yellow");
        fruitColors.put("cherry", "red");

        // Create another immutable collection using the 'of' method
        ImmutableCollection<String> otherCollection = ImmutableSet.of("grape", "orange");

        // Perform operations on the map
        for (String fruit : fruitColors.keySet()) {
            System.out.println(fruit + " is " + fruitColors.get(fruit));
        }

        // Perform operations on the other collection
        for (String fruit : otherCollection) {
            System.out.println("Fruit in other collection: " + fruit);
        }

        // Check if the collection contains the element "banana"
        /* read */ boolean containsBanana = collection.contains("banana");

        // Print the result
        System.out.println("Contains 'banana': " + containsBanana);

        // Perform additional operations on the map
        fruitColors.put("grape", "purple");
        fruitColors.put("orange", "orange");

        // Print updated map
        for (String fruit : fruitColors.keySet()) {
            System.out.println("Updated: " + fruit + " is " + fruitColors.get(fruit));
        }
    }
}