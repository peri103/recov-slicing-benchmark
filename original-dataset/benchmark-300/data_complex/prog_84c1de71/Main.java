import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(25);
        
        // Adding an element to the HashSet
        /* write */ set.add(10);
        
        // Checking if the TreeSet contains a specific element
        boolean containsTreeSetValue = treeSet.contains(15);
        System.out.println("TreeSet contains 15: " + containsTreeSetValue);
        
        // Iterating through the TreeSet and printing elements
        for (Integer num : treeSet) {
            System.out.println("TreeSet element: " + num);
        }
        
        // Checking if the HashSet contains the value added earlier
        /* read */ boolean containsValue = set.contains(10);
        System.out.println("HashSet contains 10: " + containsValue);
        
        // Adding elements from TreeSet to HashSet
        set.addAll(treeSet);
        
        // Printing all elements in the HashSet
        for (Integer num : set) {
            System.out.println("HashSet element: " + num);
        }
    }
}