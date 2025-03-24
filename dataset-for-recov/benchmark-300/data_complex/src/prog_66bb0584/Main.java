import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Add some elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Add some elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 20);
        }

        // Print elements from the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Print elements from the LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        try {
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform some additional operations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of ArrayList elements: " + sum);

        int product = 1;
        for (int num : linkedList) {
            product *= num;
        }
        System.out.println("Product of LinkedList elements: " + product);
    }
}