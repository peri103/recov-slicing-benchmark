import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Add some random values to the HashSet
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            hashSet.add(randomValue);
        }

        // Add a specific value to the SortedSet
        /* write */ set.add(42);

        // Perform some operations on the HashSet
        for (Integer value : hashSet) {
            if (value % 2 == 0) {
                set.add(value);
            }
        }

        // Check if the SortedSet contains the specific value
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Contains 42: " + containsValue);

        // Print all elements in the SortedSet
        System.out.println("SortedSet elements:");
        for (Integer value : set) {
            System.out.println(value);
        }

        // Perform some unrelated operations
        int sum = 0;
        for (Integer value : hashSet) {
            sum += value;
        }
        System.out.println("Sum of HashSet elements: " + sum);
    }
}