import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
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
        
        // Perform some unrelated operations
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList value: " + list.get(i));
        }
        
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }
        
        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Value from SynchronousQueue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Ensure the writer thread completes
        try {
            writerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // More unrelated operations
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}