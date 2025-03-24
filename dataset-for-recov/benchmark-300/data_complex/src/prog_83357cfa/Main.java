import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 5);
        }

        // Start a new thread to put a value into the queue
        new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Perform some operations with ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Take the value from the queue
        try {
            /* read */ int value = queue.take();
            System.out.println("Value taken from the queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print elements from the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element at index " + i + ": " + linkedList.get(i));
        }

        // Perform some more operations with ArrayList
        list.add(100);
        list.add(200);

        // Print elements from the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element at index " + i + ": " + list.get(i));
        }
    }
}