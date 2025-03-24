import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        linkedList.add("First");
        linkedList.add("Second");

        /* write */ set.add("example");

        // Iterating over the ArrayList and printing elements
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Iterating over the LinkedList and printing elements
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        /* read */ boolean contains = set.contains("example");
        System.out.println("Set contains 'example': " + contains);

        // Adding more elements to the ArrayList
        list.add(30);
        list.add(40);

        // Printing the updated ArrayList
        for (Integer num : list) {
            System.out.println("Updated ArrayList element: " + num);
        }

        // Adding more elements to the LinkedList
        linkedList.add("Third");
        linkedList.add("Fourth");

        // Printing the updated LinkedList
        for (String str : linkedList) {
            System.out.println("Updated LinkedList element: " + str);
        }
    }
}