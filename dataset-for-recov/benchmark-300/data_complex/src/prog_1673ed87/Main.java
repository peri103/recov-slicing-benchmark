import java.util.TreeSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Adding random numbers to the HashSet
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            hashSet.add(num);
        }

        // Adding a specific number to the TreeSet
        /* write */ set.add(10);

        // Checking if the TreeSet contains the number
        /* read */ boolean contains = set.contains(10);
        System.out.println("Does TreeSet contain 10? " + contains);

        // Adding all elements from HashSet to TreeSet
        set.addAll(hashSet);

        // Printing all elements in the TreeSet
        System.out.println("Elements in TreeSet:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // Removing an element from the TreeSet
        set.remove(10);
        System.out.println("After removing 10, does TreeSet contain 10? " + set.contains(10));

        // Adding more elements to the TreeSet
        for (int i = 0; i < 3; i++) {
            set.add(random.nextInt(50));
        }

        // Printing the size of the TreeSet
        System.out.println("Size of TreeSet: " + set.size());
    }
}