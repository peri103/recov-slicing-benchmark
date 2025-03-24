import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Add random values to the HashSet
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            hashSet.add(randomValue);
        }

        // Print the HashSet
        System.out.println("HashSet contents:");
        for (Integer value : hashSet) {
            System.out.println(value);
        }

        // Add a specific value to the CopyOnWriteArraySet
        /* write */ set.add(42);

        // Add all values from the HashSet to the CopyOnWriteArraySet
        set.addAll(hashSet);

        // Print the CopyOnWriteArraySet
        System.out.println("CopyOnWriteArraySet contents:");
        for (Integer value : set) {
            System.out.println(value);
        }

        // Check if the specific value exists in the CopyOnWriteArraySet
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Does the set contain 42? " + containsValue);

        // Perform some unrelated operations
        int sum = 0;
        for (Integer value : set) {
            sum += value;
        }
        System.out.println("Sum of all values in the set: " + sum);

        // Remove some values from the set
        set.remove(42);
        set.removeAll(hashSet);

        // Print the final state of the CopyOnWriteArraySet
        System.out.println("Final CopyOnWriteArraySet contents:");
        for (Integer value : set) {
            System.out.println(value);
        }
    }
}