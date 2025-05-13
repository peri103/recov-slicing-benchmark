import org.apache.commons.collections4.bag.TreeBag;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeBag<String> treeBag = new TreeBag<>();
        HashMap<String, Integer> fruitCountMap = new HashMap<>();
        ArrayList<String> fruits = new ArrayList<>();

        // Adding fruits to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // Count occurrences of each fruit in the list
        for (String fruit : fruits) {
            fruitCountMap.put(fruit, fruitCountMap.getOrDefault(fruit, 0) + 1);
        }

        // Display fruit counts
        for (String fruit : fruitCountMap.keySet()) {
            System.out.println(fruit + ": " + fruitCountMap.get(fruit));
        }

        // Add an apple to the TreeBag
        /* write */ treeBag.add("apple");

        // Perform some unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        // Print the numbers
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Check the count of apples in the TreeBag
        /* read */ int count = treeBag.getCount("apple");
        System.out.println("Count of apple in TreeBag: " + count);

        // Add more fruits to the TreeBag
        treeBag.add("banana");
        treeBag.add("orange");

        // Print the count of each fruit in the TreeBag
        for (String fruit : fruits) {
            System.out.println("Count of " + fruit + " in TreeBag: " + treeBag.getCount(fruit));
        }
    }
}