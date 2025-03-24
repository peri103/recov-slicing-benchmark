import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        linkedList.addAll(list);

        // Perform the read operation in the main thread
        /* read */ int value = queue.take();
        System.out.println("Value from queue: " + value);

        // Ensure the writer thread completes
        writerThread.join();

        // Print the contents of the linked list
        System.out.println("Linked list contents:");
        for (int num : linkedList) {
            System.out.println(num);
        }

        // Perform some more unrelated operations
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println(str);
        }
    }
}