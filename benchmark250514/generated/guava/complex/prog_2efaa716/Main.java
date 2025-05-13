import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        /* write */ multiset.add("apple");

        // Additional code using Guava and Java collections
        Multiset<String> anotherMultiset = HashMultiset.create();
        anotherMultiset.add("banana", 2);
        anotherMultiset.add("orange", 3);

        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        Map<String, Integer> fruitCountMap = new HashMap<>();
        for (String fruit : fruits) {
            fruitCountMap.put(fruit, anotherMultiset.count(fruit));
        }

        for (Map.Entry<String, Integer> entry : fruitCountMap.entrySet()) {
            System.out.println("Count of '" + entry.getKey() + "': " + entry.getValue());
        }

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        /* read */ int count = multiset.count("apple");
        System.out.println("Count of 'apple': " + count);
    }
}