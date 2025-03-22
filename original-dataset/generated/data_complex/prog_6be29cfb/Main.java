import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        Set<String> hashSet = new HashSet<>();
        
        // Add elements to the HashSet
        hashSet.add("Hello");
        hashSet.add("World");
        
        // Add elements to the SortedSet
        /* write */ sortedSet.add(42);
        sortedSet.add(15);
        sortedSet.add(30);
        
        // Print elements of the HashSet
        for (String str : hashSet) {
            System.out.println("HashSet contains: " + str);
        }
        
        // Use a loop to perform some operations
        for (int i = 0; i < 5; i++) {
            sortedSet.add(i * 10);
        }
        
        // Check if an element exists in the SortedSet
        int checkValue = 42;
        /* read */ boolean containsValue = sortedSet.contains(checkValue);
        
        // Print result of the contains check
        System.out.println("SortedSet contains " + checkValue + ": " + containsValue);
        
        // Print all elements in the SortedSet
        for (Integer num : sortedSet) {
            System.out.println("SortedSet element: " + num);
        }
        
        // Perform additional operations on HashSet
        if (hashSet.contains("Hello")) {
            System.out.println("HashSet contains 'Hello'");
        }
        
        // Remove an element from the HashSet
        hashSet.remove("World");
        System.out.println("HashSet after removal: " + hashSet);
    }
}