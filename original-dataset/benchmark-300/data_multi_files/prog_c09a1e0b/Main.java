import java.util.TreeSet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeSetOperations treeSetOps = new TreeSetOperations();
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        // Adding random values to hashSet
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            hashSet.add(randomValue);
        }

        // Adding a specific value to treeSet
        treeSetOps.addValue(42);

        // Adding all values from hashSet to treeSet
        treeSetOps.getTreeSet().addAll(hashSet);

        // Printing the contents of treeSet
        System.out.println("TreeSet contents: " + treeSetOps.getTreeSet());

        // Checking if the specific value is in treeSet
        /* read */ boolean containsValue = treeSetOps.containsValue(42);
        System.out.println("TreeSet contains 42: " + containsValue);

        // Additional operations to make the program more complex
        TreeSet<Integer> anotherTreeSet = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            anotherTreeSet.add(random.nextInt(50));
        }

        // Union of two TreeSets
        treeSetOps.getTreeSet().addAll(anotherTreeSet);
        System.out.println("Union of TreeSets: " + treeSetOps.getTreeSet());

        // Checking if all elements of anotherTreeSet are in treeSet
        boolean containsAll = treeSetOps.getTreeSet().containsAll(anotherTreeSet);
        System.out.println("TreeSet contains all elements of anotherTreeSet: " + containsAll);

        // Removing elements from treeSet
        treeSetOps.getTreeSet().removeAll(anotherTreeSet);
        System.out.println("TreeSet after removal: " + treeSetOps.getTreeSet());

        // Checking if treeSet is empty
        boolean isEmpty = treeSetOps.getTreeSet().isEmpty();
        System.out.println("TreeSet is empty: " + isEmpty);
    }
}