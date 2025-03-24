import java.util.concurrent.ConcurrentSkipListSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Add some random values to the hashSet
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            hashSet.add(randomValue);
        }

        // Print the hashSet
        System.out.println("HashSet contents: " + hashSet);

        // Add a specific value to the ConcurrentSkipListSet
        /* write */ set.add(42);

        // Check if the value exists in the set
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("ConcurrentSkipListSet contains 42: " + containsValue);

        // Add all elements from hashSet to the ConcurrentSkipListSet
        set.addAll(hashSet);

        // Print the ConcurrentSkipListSet
        System.out.println("ConcurrentSkipListSet contents: " + set);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 integers: " + sum);

        // Check if the ConcurrentSkipListSet contains a random value from hashSet
        int randomElement = hashSet.iterator().next();
        boolean containsRandomElement = set.contains(randomElement);
        System.out.println("ConcurrentSkipListSet contains " + randomElement + ": " + containsRandomElement);
    }
}