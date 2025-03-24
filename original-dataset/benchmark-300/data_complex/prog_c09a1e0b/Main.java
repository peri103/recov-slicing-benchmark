import java.util.TreeSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Adding random values to hashSet
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            hashSet.add(randomValue);
        }

        // Adding a specific value to treeSet
        /* write */ treeSet.add(42);

        // Adding all values from hashSet to treeSet
        treeSet.addAll(hashSet);

        // Printing the contents of treeSet
        System.out.println("TreeSet contents: " + treeSet);

        // Checking if the specific value is in treeSet
        /* read */ boolean containsValue = treeSet.contains(42);
        System.out.println("TreeSet contains 42: " + containsValue);

        // Additional operations to make the program more complex
        TreeSet<Integer> anotherTreeSet = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            anotherTreeSet.add(random.nextInt(50));
        }

        // Union of two TreeSets
        treeSet.addAll(anotherTreeSet);
        System.out.println("Union of TreeSets: " + treeSet);

        // Checking if all elements of anotherTreeSet are in treeSet
        boolean containsAll = treeSet.containsAll(anotherTreeSet);
        System.out.println("TreeSet contains all elements of anotherTreeSet: " + containsAll);

        // Removing elements from treeSet
        treeSet.removeAll(anotherTreeSet);
        System.out.println("TreeSet after removal: " + treeSet);

        // Checking if treeSet is empty
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("TreeSet is empty: " + isEmpty);
    }
}