import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Additional complex code
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
            linkedList.add(i * 3);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("LinkedList: " + linkedList);

        // Thread to perform the read operation
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the reader thread
        readerThread.start();

        // Wait for the threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More complex code
        ArrayList<Integer> combinedList = new ArrayList<>();
        combinedList.addAll(list);
        combinedList.addAll(linkedList);

        System.out.println("Combined List: " + combinedList);

        for (int i = 0; i < combinedList.size(); i++) {
            combinedList.set(i, combinedList.get(i) + 1);
        }

        System.out.println("Modified Combined List: " + combinedList);
    }
}