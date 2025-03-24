import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        Set<Integer> hashSet = new HashSet<>();

        // Adding elements to hashSet
        for (int i = 0; i < 5; i++) {
            hashSet.add(i * 10);
        }

        // Adding all elements from hashSet to set
        set.addAll(hashSet);

        // Printing elements from set
        for (Integer num : set) {
            System.out.println(num);
        }

        // Writing a specific value to set
        /* write */ set.add(100);

        // Performing some operations on hashSet
        hashSet.remove(0);
        hashSet.add(50);

        // Reading from set
        /* read */ boolean containsValue = set.contains(100);
        System.out.println("Set contains 100: " + containsValue);

        // Adding more elements to set
        for (int i = 6; i < 10; i++) {
            set.add(i * 10);
        }

        // Printing all elements from set
        for (Integer num : set) {
            System.out.println(num);
        }

        // Checking if set contains all elements from hashSet
        boolean containsAll = set.containsAll(hashSet);
        System.out.println("Set contains all elements from hashSet: " + containsAll);
    }
}