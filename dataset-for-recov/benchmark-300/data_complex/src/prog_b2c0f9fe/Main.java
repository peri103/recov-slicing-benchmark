import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Start a new thread to write the value
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writerThread.start();
        
        // Add some unrelated operations
        for (int i = 0; i < 10; i++) {
            list.add(i);
            linkedList.add(i * 2);
        }
        
        // Print the list and linked list
        System.out.println("ArrayList: " + list);
        System.out.println("LinkedList: " + linkedList);
        
        // Read the value in the main thread
        /* read */ int value = queue.take();
        System.out.println("Value from queue: " + value);
        
        // Ensure the writer thread completes
        writerThread.join();
        
        // More unrelated operations
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(i * 10);
        }
        
        System.out.println("Second ArrayList: " + list2);
        
        // Add elements from list2 to list
        list.addAll(list2);
        System.out.println("Combined ArrayList: " + list);
    }
}