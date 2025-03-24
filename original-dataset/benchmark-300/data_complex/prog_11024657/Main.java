import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();

        // Add some unrelated operations to make the program more complex
        list.add(10);
        list.add(20);
        linkedList.add(30);
        linkedList.add(40);

        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        try {
            // Wait for the write operation to complete and then perform the read operation
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the contents of the linked list
        System.out.println("Linked List contents:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}