import java.util.SortedSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        
        // Adding elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 2);
        }
        
        // Adding elements from the list to the set
        for (Integer num : list) {
            set.add(num);
        }
        
        /* write */ set.add(10);
        
        // Checking if the set contains a specific element
        for (Integer num : set) {
            if (num == 5) {
                System.out.println("Set contains 5");
            }
        }
        
        // Adding more elements to the list
        list.add(15);
        list.add(20);
        
        // Adding elements from the list to the set
        for (Integer num : list) {
            set.add(num);
        }
        
        /* read */ boolean contains = set.contains(10);
        System.out.println("Set contains 10: " + contains);
        
        // Printing all elements in the set
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}