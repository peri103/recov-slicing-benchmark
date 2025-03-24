import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 20);
        }

        /* write */ queue.offer(42);

        // Processing the ArrayList
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Processing the LinkedList
        for (Integer num : linkedList) {
            System.out.println("LinkedList element: " + num);
        }

        /* read */ Integer value = queue.poll();
        System.out.println("Value from queue: " + value);

        // Additional operations
        list.add(100);
        linkedList.add(200);

        for (Integer num : list) {
            System.out.println("Updated ArrayList element: " + num);
        }

        for (Integer num : linkedList) {
            System.out.println("Updated LinkedList element: " + num);
        }
    }
}