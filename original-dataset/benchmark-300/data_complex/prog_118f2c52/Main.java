import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Adding elements to the deque
        /* write */ deque.addLast(42);

        // Processing the list and linkedList
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Adding elements from linkedList to deque
        for (int i = 0; i < linkedList.size(); i++) {
            deque.addLast(linkedList.get(i));
        }

        // Reading the last element from the deque
        /* read */ int value = deque.getLast();
        System.out.println(value);

        // Additional processing
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < deque.size(); i++) {
            newList.add(deque.pollFirst());
        }

        // Printing the newList
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}