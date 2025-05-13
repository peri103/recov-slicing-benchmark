import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        Map<String, Integer> fruitBasket = new HashMap<>();

        // Adding some initial fruits to the map
        fruitBasket.put("banana", 2);
        fruitBasket.put("orange", 3);

        // Using a different Multiset for another purpose
        Multiset<String> anotherMultiset = HashMultiset.create();
        anotherMultiset.add("grape");
        anotherMultiset.add("grape");
        anotherMultiset.add("banana");

        // Simulating some operations on the fruit basket
        for (Map.Entry<String, Integer> entry : fruitBasket.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Adding an apple to the original multiset
        /* write */ multiset.add("apple");

        // Performing some unrelated operations
        for (String fruit : anotherMultiset.elementSet()) {
            System.out.println("Another Multiset Fruit: " + fruit + ", Count: " + anotherMultiset.count(fruit));
        }

        // More operations on the fruit basket
        fruitBasket.put("apple", 1);
        fruitBasket.put("banana", fruitBasket.get("banana") + 1);

        // Reading the count of apples in the original multiset
        /* read */ int count = multiset.count("apple");

        System.out.println("Count of apples in the multiset: " + count);

        // Final operations
        for (String fruit : fruitBasket.keySet()) {
            System.out.println("Final Fruit Basket: " + fruit + ", Total Count: " + fruitBasket.get(fruit));
        }
    }
}