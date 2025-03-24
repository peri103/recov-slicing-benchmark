import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        Set<String> hashSet = new HashSet<>();
        
        // Adding elements to the HashSet
        hashSet.add("first");
        hashSet.add("second");
        hashSet.add("third");
        
        // Iterating over the HashSet and printing elements
        for (String element : hashSet) {
            System.out.println("HashSet Element: " + element);
        }
        
        // Writing to the CopyOnWriteArraySet
        /* write */ set.add("example");
        
        // Adding all elements from HashSet to CopyOnWriteArraySet
        set.addAll(hashSet);
        
        // Checking if the CopyOnWriteArraySet contains a specific element
        /* read */ boolean containsValue = set.contains("example");
        System.out.println("CopyOnWriteArraySet contains 'example': " + containsValue);
        
        // Iterating over the CopyOnWriteArraySet and printing elements
        for (String element : set) {
            System.out.println("CopyOnWriteArraySet Element: " + element);
        }
    }
}