import java.util.SortedSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Adding elements to the set
        /* write */ set.add(10);

        // Printing elements from the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        // Printing elements from the linkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        // Checking if the set contains the value
        /* read */ boolean containsValue = set.contains(10);
        System.out.println("Set contains 10: " + containsValue);

        // Adding more elements to the set
        set.add(20);
        set.add(30);

        // Printing all elements in the set
        for (Integer value : set) {
            System.out.println("Set element: " + value);
        }
    }
}