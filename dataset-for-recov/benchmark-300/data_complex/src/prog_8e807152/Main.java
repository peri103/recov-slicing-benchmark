import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Add some initial elements to the list
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
                System.out.println("Value from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start both threads
        writerThread.start();
        readerThread.start();
        
        // Wait for both threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Add elements from list to linkedList
        for (Integer num : list) {
            linkedList.add(num);
        }
        
        // Print elements from linkedList
        System.out.println("Elements in linkedList:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }
        
        // Perform some additional operations
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of elements in list: " + sum);
        
        // Reverse the linkedList
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (Integer num : linkedList) {
            reversedList.addFirst(num);
        }
        
        // Print reversed linkedList
        System.out.println("Reversed linkedList:");
        for (Integer num : reversedList) {
            System.out.println(num);
        }
    }
}