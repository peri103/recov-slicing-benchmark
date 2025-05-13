import org.apache.commons.collections4.set.ListOrderedSet;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(new HashSet<String>());
        ArrayList<String> arrayList = new ArrayList<>();
        
        /* write */ set.add("Hello World");
        
        // Adding more elements to the ListOrderedSet
        set.add("Apache");
        set.add("Commons");
        set.add("Collections");
        
        // Adding elements to ArrayList
        arrayList.add("Java");
        arrayList.add("Programming");
        
        // Iterating through the ListOrderedSet and adding elements to ArrayList
        for (String element : set) {
            arrayList.add(element);
        }
        
        // Printing elements of ArrayList
        for (String element : arrayList) {
            System.out.println(element);
        }
        
        // Calculating the sum of lengths of all strings in the set
        int totalLength = 0;
        for (String element : set) {
            totalLength += element.length();
        }
        System.out.println("Total length of strings in set: " + totalLength);
        
        /* read */ String value = set.get(0);
        System.out.println(value);
        
        // Performing some operations on ArrayList
        arrayList.add("End");
        arrayList.remove(0);
        
        // Printing final state of ArrayList
        System.out.println("Final ArrayList: " + arrayList);
    }
}