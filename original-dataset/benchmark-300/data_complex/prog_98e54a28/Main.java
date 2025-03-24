import java.util.TreeSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Add random values to the HashSet
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            hashSet.add(randomValue);
        }

        // Add a specific value to the TreeSet
        /* write */ set.add(50);

        // Perform some operations on the HashSet
        int sum = 0;
        for (int value : hashSet) {
            sum += value;
        }
        System.out.println("Sum of HashSet values: " + sum);

        // Check if the TreeSet contains the specific value
        /* read */ boolean containsValue = set.contains(50);
        System.out.println("TreeSet contains 50: " + containsValue);

        // Add more values to the TreeSet
        for (int i = 0; i < 5; i++) {
            set.add(i * 20);
        }

        // Print all values in the TreeSet
        System.out.println("Values in TreeSet:");
        for (int value : set) {
            System.out.println(value);
        }
    }
}