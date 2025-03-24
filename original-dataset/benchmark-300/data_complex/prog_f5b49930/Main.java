import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        ArrayList<String> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        // Adding elements to the LinkedList
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        /* write */ deque.addFirst("Hello, World!");

        // Iterating over the ArrayList and printing elements
        for (String element : list) {
            System.out.println(element);
        }

        // Iterating over the LinkedList and printing elements
        for (Integer number : linkedList) {
            System.out.println(number);
        }

        /* read */ String value = deque.peekFirst();
        System.out.println(value);

        // Adding more elements to the deque
        deque.addLast("Another Element");
        deque.addLast("Yet Another Element");

        // Printing all elements in the deque
        for (String element : deque) {
            System.out.println(element);
        }
    }
}