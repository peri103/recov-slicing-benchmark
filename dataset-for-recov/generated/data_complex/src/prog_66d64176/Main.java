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
        
        // Performing operations on hashSet
        for (int i = 0; i < 5; i++) {
            hashSet.add(i * 5);
        }
        
        // Printing all elements in hashSet
        for (Integer num : hashSet) {
            System.out.println("HashSet contains: " + num);
        }
        
        // Adding more elements to sortedSet
        sortedSet.add(1);
        sortedSet.add(3);
        sortedSet.add(7);
        
        /* write */ sortedSet.add(5);
        
        // Performing some operations on sortedSet
        for (int i = 10; i < 15; i++) {
            sortedSet.add(i);
        }
        
        // Checking if sortedSet contains certain elements
        boolean containsValue = sortedSet.contains(5);
        boolean containsAnotherValue = sortedSet.contains(10);
        
        /* read */ System.out.println("SortedSet contains 5: " + containsValue);
        
        // Printing all elements in sortedSet
        for (Integer num : sortedSet) {
            System.out.println("SortedSet contains: " + num);
        }
        
        System.out.println("SortedSet contains 10: " + containsAnotherValue);
    }
}