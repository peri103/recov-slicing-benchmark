import java.util.concurrent.ConcurrentSkipListSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        list.add(20);
        list.add(30);
        linkedList.add(40);
        linkedList.add(50);

        /* write */ set.add(10);

        // Iterating over the list and adding elements to the set
        for (Integer num : list) {
            set.add(num);
        }

        // Iterating over the linkedList and adding elements to the set
        for (Integer num : linkedList) {
            set.add(num);
        }

        // Printing elements from the set
        for (Integer num : set) {
            System.out.println(num);
        }

        /* read */ boolean contains = set.contains(10);
        System.out.println("Set contains 10: " + contains);

        // Adding more elements to the list and linkedList
        list.add(60);
        linkedList.add(70);

        // Iterating over the list and adding elements to the set
        for (Integer num : list) {
            set.add(num);
        }

        // Iterating over the linkedList and adding elements to the set
        for (Integer num : linkedList) {
            set.add(num);
        }

        // Printing elements from the set again
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}