import java.util.concurrent.ConcurrentSkipListSet;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        // Generate a list of random numbers
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        // Shuffle the list
        Collections.shuffle(numbers);

        // Add the numbers to the set
        for (int num : numbers) {
            set.add(num);
        }

        // Write a specific value to the set
        /* write */ set.add(42);

        // Perform some unrelated operations
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        // Print the sorted list
        System.out.println("Sorted Numbers: " + sortedNumbers);

        // Check if the set contains the written value
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Contains 42: " + containsValue);

        // Perform more unrelated operations
        int sum = 0;
        for (int num : sortedNumbers) {
            sum += num;
        }
        System.out.println("Sum of sorted numbers: " + sum);

        // Print the set
        System.out.println("Set contents: " + set);
    }
}