import org.apache.commons.collections4.bag.TreeBag;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TreeBag<String> bag = new TreeBag<>();
        HashMap<String, Integer> fruitCountMap = new HashMap<>();

        // Add multiple fruits to the TreeBag
        bag.add("banana");
        bag.add("orange");
        /* write */ bag.add("apple");
        bag.add("banana");
        bag.add("apple");
        
        // Populate the HashMap with the count of each fruit
        fruitCountMap.put("banana", bag.getCount("banana"));
        fruitCountMap.put("orange", bag.getCount("orange"));
        
        // Perform some operations with the HashMap
        for (String fruit : fruitCountMap.keySet()) {
            System.out.println("Count of '" + fruit + "': " + fruitCountMap.get(fruit));
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the count of 'apple' from the TreeBag
        /* read */ int appleCount = bag.getCount("apple");
        System.out.println("Count of 'apple': " + appleCount);

        // Additional complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}