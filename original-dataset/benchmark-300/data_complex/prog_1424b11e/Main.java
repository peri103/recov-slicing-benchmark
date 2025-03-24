import java.util.concurrent.LinkedTransferQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
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

        // Writing to the queue
        /* write */ queue.put(1);

        // Processing the ArrayList
        for (Integer num : list) {
            System.out.println("ArrayList value: " + num);
        }

        // Processing the LinkedList
        for (Integer num : linkedList) {
            System.out.println("LinkedList value: " + num);
        }

        // Reading from the queue
        try {
            /* read */ int value = queue.take();
            System.out.println("Queue value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional operations
        list.add(100);
        linkedList.add(200);

        // Printing the final state of the ArrayList and LinkedList
        System.out.println("Final ArrayList: " + list);
        System.out.println("Final LinkedList: " + linkedList);
    }
}