import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        ArrayList<String> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        list.add("Element1");
        list.add("Element2");

        // Adding elements to the LinkedList
        linkedList.add(100);
        linkedList.add(200);

        // Adding an element to the CopyOnWriteArraySet
        /* write */ set.add("Hello");

        // Iterating over the ArrayList and adding elements to the CopyOnWriteArraySet
        for (String element : list) {
            set.add(element);
        }

        // Iterating over the LinkedList and adding elements to the CopyOnWriteArraySet
        for (Integer number : linkedList) {
            set.add(number.toString());
        }

        // Checking if the CopyOnWriteArraySet contains the initial element
        /* read */ boolean contains = set.contains("Hello");
        System.out.println("Contains 'Hello': " + contains);

        // Printing all elements in the CopyOnWriteArraySet
        for (String element : set) {
            System.out.println(element);
        }

        // Adding more elements to the ArrayList
        list.add("Element3");
        list.add("Element4");

        // Adding more elements to the LinkedList
        linkedList.add(300);
        linkedList.add(400);

        // Iterating over the updated ArrayList and adding elements to the CopyOnWriteArraySet
        for (String element : list) {
            set.add(element);
        }

        // Iterating over the updated LinkedList and adding elements to the CopyOnWriteArraySet
        for (Integer number : linkedList) {
            set.add(number.toString());
        }

        // Printing all elements in the CopyOnWriteArraySet again
        for (String element : set) {
            System.out.println(element);
        }
    }
}