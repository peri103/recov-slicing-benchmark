import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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

        // Start the writer thread
        writerThread.start();

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        linkedList.addAll(list);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }

        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for the writer thread to finish
        try {
            writerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More unrelated operations
        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(100);
        anotherList.add(200);
        for (int i = 0; i < anotherList.size(); i++) {
            System.out.println("Another list value: " + anotherList.get(i));
        }
    }
}