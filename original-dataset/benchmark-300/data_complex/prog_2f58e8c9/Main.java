import java.util.concurrent.ConcurrentSkipListSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        // Writing to the ConcurrentSkipListSet
        /* write */ set.add(42);

        // Performing some operations on the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Performing some operations on the LinkedList
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Reading from the ConcurrentSkipListSet
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Contains value 42: " + containsValue);

        // Adding more elements to the ArrayList
        list.add(100);
        list.add(200);

        // Adding more elements to the LinkedList
        linkedList.add("Fourth");
        linkedList.add("Fifth");

        // Printing the final state of the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Final ArrayList element: " + list.get(i));
        }

        // Printing the final state of the LinkedList
        for (String str : linkedList) {
            System.out.println("Final LinkedList element: " + str);
        }
    }
}