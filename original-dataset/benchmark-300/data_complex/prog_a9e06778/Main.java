import java.util.concurrent.ConcurrentSkipListSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Add some random integers to the HashSet
        for (int i = 0; i < 10; i++) {
            hashSet.add(random.nextInt(100));
        }

        // Print the HashSet
        System.out.println("HashSet: " + hashSet);

        /* write */ set.add("example");

        // Perform some operations on the HashSet
        int sum = 0;
        for (Integer num : hashSet) {
            sum += num;
        }
        System.out.println("Sum of HashSet elements: " + sum);

        // Check if the HashSet contains a specific number
        boolean containsNumber = hashSet.contains(42);
        System.out.println("HashSet contains 42: " + containsNumber);

        /* read */ boolean contains = set.contains("example");
        System.out.println("ConcurrentSkipListSet contains 'example': " + contains);

        // Add more elements to the ConcurrentSkipListSet
        set.add("anotherExample");
        set.add("yetAnotherExample");

        // Print the ConcurrentSkipListSet
        System.out.println("ConcurrentSkipListSet: " + set);
    }
}