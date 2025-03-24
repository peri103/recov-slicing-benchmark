import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Start a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        linkedList.addAll(list);

        // Perform the read operation in the main thread
        /* read */ int value = queue.take();
        System.out.println("Value from queue: " + value);

        // Wait for the writer thread to finish
        writerThread.join();

        // More unrelated operations
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        // Another unrelated operation
        List<Integer> copiedList = new ArrayList<>(list);
        copiedList.add(100);
        System.out.println("Copied list size: " + copiedList.size());
    }
}