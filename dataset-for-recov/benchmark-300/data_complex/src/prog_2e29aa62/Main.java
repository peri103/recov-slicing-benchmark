import java.util.concurrent.LinkedTransferQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding some initial elements to the list and linkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Performing some operations on the list and linkedList
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Writing to the queue
        /* write */ queue.put(42);

        // Performing some more operations
        for (int i = 0; i < linkedList.size(); i++) {
            list.add(linkedList.get(i));
        }

        // Reading from the queue
        try {
            /* read */ int value = queue.take();
            System.out.println("Value taken from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the final state of the list and linkedList
        System.out.println("Final list: " + list);
        System.out.println("Final linkedList: " + linkedList);
    }
}