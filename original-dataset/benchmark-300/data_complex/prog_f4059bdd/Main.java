import java.util.concurrent.ConcurrentSkipListSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Adding elements to the set
        for (int i = 0; i < 5; i++) {
            set.add(i * 30);
        }

        // Writing to the set
        /* write */ set.add(1);

        // Adding elements from list to linkedList
        for (Integer num : list) {
            linkedList.add(num);
        }

        // Reading from the set
        /* read */ boolean containsValue = set.contains(1);

        // Printing the result
        System.out.println("Contains value 1: " + containsValue);

        // Printing elements from linkedList
        System.out.println("Elements in linkedList:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        // Adding elements from linkedList to set
        for (Integer num : linkedList) {
            set.add(num);
        }

        // Printing elements from set
        System.out.println("Elements in set:");
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}