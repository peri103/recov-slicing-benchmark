import java.util.TreeSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Adding random numbers to the HashSet
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            hashSet.add(randomNumber);
        }

        // Copying values from HashSet to TreeSet
        for (int num : hashSet) {
            treeSet.add(num);
        }

        // Writing a specific value to the TreeSet
        /* write */ treeSet.add(10);

        // Performing some unrelated operations
        int sum = 0;
        for (int num : treeSet) {
            sum += num;
        }
        System.out.println("Sum of all elements in TreeSet: " + sum);

        // Checking if the TreeSet contains the written value
        /* read */ boolean containsValue = treeSet.contains(10);
        System.out.println("TreeSet contains 10: " + containsValue);

        // Adding more elements to the TreeSet
        for (int i = 0; i < 5; i++) {
            treeSet.add(random.nextInt(50));
        }

        // Printing the final state of the TreeSet
        System.out.println("Final TreeSet: " + treeSet);
    }
}