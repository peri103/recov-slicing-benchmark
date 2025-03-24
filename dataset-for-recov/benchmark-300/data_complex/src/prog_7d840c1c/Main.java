import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        // Adding some unrelated elements to make the program more complex
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        
        /* write */ set.add(42);
        
        // Performing some operations on the TreeSet
        for (Integer num : treeSet) {
            System.out.println("TreeSet element: " + num);
        }
        
        // Adding more elements to the HashSet
        set.add(100);
        set.add(200);
        
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Does the HashSet contain 42? " + containsValue);
        
        // More unrelated code
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        System.out.println("Sum of all elements in HashSet: " + sum);
    }
}