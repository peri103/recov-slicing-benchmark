import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Thread to write to the queue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read from the queue
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 20);
        }

        // Printing elements from the ArrayList
        System.out.println("Elements in ArrayList:");
        for (int num : list) {
            System.out.println(num);
        }

        // Printing elements from the LinkedList
        System.out.println("Elements in LinkedList:");
        for (int num : linkedList) {
            System.out.println(num);
        }

        // Combining elements from both lists
        ArrayList<Integer> combinedList = new ArrayList<>();
        combinedList.addAll(list);
        combinedList.addAll(linkedList);

        // Printing combined list
        System.out.println("Combined List:");
        for (int num : combinedList) {
            System.out.println(num);
        }
    }
}