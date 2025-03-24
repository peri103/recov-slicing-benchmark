import java.util.concurrent.ConcurrentSkipListSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        list.add(5);
        list.add(15);
        linkedList.add("Hello");
        linkedList.add("World");

        /* write */ set.add(10);

        // Iterating through the list and adding elements to the set
        for (Integer num : list) {
            set.add(num);
        }

        // Printing elements from the linkedList
        for (String str : linkedList) {
            System.out.println(str);
        }

        // Adding more elements to the set
        set.add(20);
        set.add(30);

        // Checking if the set contains a specific value
        /* read */ boolean containsValue = set.contains(10);
        System.out.println("Set contains 10: " + containsValue);

        // Printing all elements in the set
        System.out.println("Elements in the set:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // Adding elements to the list
        list.add(25);
        list.add(35);

        // Printing elements from the list
        System.out.println("Elements in the list:");
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}