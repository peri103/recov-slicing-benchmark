import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create a thread to perform the read operation
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value taken from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        writerThread.start();
        readerThread.start();

        // Wait for the threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Add elements from ArrayList to LinkedList
        for (Integer num : list) {
            linkedList.add(num);
        }

        // Print elements from LinkedList
        System.out.println("Elements in LinkedList:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        // Perform some additional operations
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of elements in ArrayList: " + sum);

        // Reverse the LinkedList
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (Integer num : linkedList) {
            reversedList.addFirst(num);
        }

        // Print reversed LinkedList
        System.out.println("Reversed LinkedList:");
        for (Integer num : reversedList) {
            System.out.println(num);
        }
    }
}