import java.util.concurrent.ConcurrentSkipListSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Add random integers to the HashSet
        for (int i = 0; i < 10; i++) {
            hashSet.add(random.nextInt(100));
        }

        // Print the HashSet
        System.out.println("HashSet values: " + hashSet);

        // Add a value to the ConcurrentSkipListSet
        /* write */ set.add("testValue");

        // Perform some unrelated operations
        int sum = 0;
        for (Integer num : hashSet) {
            sum += num;
        }
        System.out.println("Sum of HashSet values: " + sum);

        // Check if the value exists in the ConcurrentSkipListSet
        /* read */ boolean containsValue = set.contains("testValue");
        System.out.println("Contains 'testValue': " + containsValue);

        // Add more values to the ConcurrentSkipListSet
        for (int i = 0; i < 5; i++) {
            set.add("value" + i);
        }

        // Print the ConcurrentSkipListSet
        System.out.println("ConcurrentSkipListSet values: " + set);
    }
}