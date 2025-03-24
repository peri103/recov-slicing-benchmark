import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        /* write */ deque.addLast(42);

        // Processing the ArrayList
        for (Integer num : list) {
            System.out.println("ArrayList value: " + num);
        }

        // Processing the LinkedList
        for (Integer num : linkedList) {
            System.out.println("LinkedList value: " + num);
        }

        /* read */ Integer value = deque.peekLast();
        System.out.println("Deque value: " + value);

        // Additional processing
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Processed ArrayList value: " + (list.get(i) + 1));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Processed LinkedList value: " + (linkedList.get(i) + 1));
        }
    }
}