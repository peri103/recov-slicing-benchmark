import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();
        
        // Adding elements to hashSet
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        
        // Iterating over hashSet and adding elements to sortedSet
        for (Integer num : hashSet) {
            sortedSet.add(num);
        }
        
        /* write */ sortedSet.add(42);
        
        // Perform some operations on hashSet
        if (hashSet.contains(20)) {
            hashSet.remove(20);
        }
        
        // Adding more elements to sortedSet
        sortedSet.add(50);
        sortedSet.add(60);
        
        // Iterating over sortedSet
        for (Integer num : sortedSet) {
            System.out.println("SortedSet element: " + num);
        }
        
        // Checking if sortedSet contains specific elements
        /* read */ boolean containsValue = sortedSet.contains(42);
        System.out.println("Contains 42: " + containsValue);
        
        // Additional operations on sortedSet
        if (sortedSet.contains(50)) {
            System.out.println("SortedSet contains 50");
        }
        
        // Checking size of sortedSet
        System.out.println("Size of sortedSet: " + sortedSet.size());
    }
}