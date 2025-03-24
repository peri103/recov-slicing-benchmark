import java.util.concurrent.ConcurrentSkipListSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Populate hashSet with random integers
        for (int i = 0; i < 10; i++) {
            hashSet.add(random.nextInt(100));
        }

        // Print the hashSet
        System.out.println("HashSet: " + hashSet);

        // Add a string to the ConcurrentSkipListSet
        /* write */ set.add("Hello");

        // Perform some operations on hashSet
        int sum = 0;
        for (Integer num : hashSet) {
            sum += num;
        }
        System.out.println("Sum of HashSet elements: " + sum);

        // Check if the ConcurrentSkipListSet contains the string "Hello"
        /* read */ boolean contains = set.contains("Hello");
        System.out.println("ConcurrentSkipListSet contains 'Hello': " + contains);

        // Add more elements to the ConcurrentSkipListSet
        set.add("World");
        set.add("Java");

        // Print the ConcurrentSkipListSet
        System.out.println("ConcurrentSkipListSet: " + set);
    }
}