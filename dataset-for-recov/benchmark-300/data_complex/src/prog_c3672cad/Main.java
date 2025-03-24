import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Create a thread to perform the write operation
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the writer thread
        writer.start();
        
        // Create an ArrayList and LinkedList for additional complexity
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Add some elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Copy elements from ArrayList to LinkedList
        for (Integer num : list) {
            linkedList.add(num);
        }
        
        // Print elements from LinkedList
        for (Integer num : linkedList) {
            System.out.println("LinkedList value: " + num);
        }
        
        // Create a thread to perform the read operation
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the reader thread
        reader.start();
        
        // Wait for the threads to finish
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}