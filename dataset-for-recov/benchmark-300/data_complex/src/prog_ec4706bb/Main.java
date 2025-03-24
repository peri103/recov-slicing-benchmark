import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        ArrayList<String> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        list.add("World");
        list.add("Java");

        // Adding elements to the LinkedList
        linkedList.add(100);
        linkedList.add(200);

        /* write */ deque.addFirst("Hello");

        // Iterating through the ArrayList and adding elements to the deque
        for (String element : list) {
            deque.addLast(element);
        }

        // Iterating through the LinkedList and adding elements to the deque
        for (Integer number : linkedList) {
            deque.addLast(number.toString());
        }

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* read */ String value = deque.peekFirst();
        System.out.println("First element in deque: " + value);

        // Printing all elements in the deque
        System.out.println("All elements in deque:");
        for (String element : deque) {
            System.out.println(element);
        }
    }
}