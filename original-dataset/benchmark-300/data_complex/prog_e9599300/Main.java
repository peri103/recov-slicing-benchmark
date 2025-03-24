import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        
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
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }
        
        // Print the list
        for (int num : list) {
            System.out.println(num);
        }
        
        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Ensure the writer thread completes
        try {
            writerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Perform some more unrelated operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}