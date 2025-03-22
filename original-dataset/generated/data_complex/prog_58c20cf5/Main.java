import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        Set<String> stringSet = new HashSet<>();
        
        // Adding elements to the string set
        stringSet.add("Hello");
        stringSet.add("World");
        
        // Iterating over stringSet
        for (String str : stringSet) {
            System.out.println(str);
        }

        /* write */ sortedSet.add(10);
        
        // Adding more elements to sortedSet
        sortedSet.add(20);
        sortedSet.add(30);
        
        // Performing some operations on sortedSet
        for (Integer num : sortedSet) {
            System.out.println("Number: " + num);
        }
        
        // Checking if a number exists in sortedSet
        boolean containsTwenty = sortedSet.contains(20);
        System.out.println("Contains 20: " + containsTwenty);
        
        // Adding more complexity with another data structure
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(3.14);
        doubleSet.add(1.618);
        
        for (Double d : doubleSet) {
            System.out.println("Double value: " + d);
        }
        
        /* read */ boolean containsValue = sortedSet.contains(10);
        System.out.println("Contains 10: " + containsValue);
    }
}