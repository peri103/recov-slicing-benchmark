import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        
        // Thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to perform the read operation
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
                list.add(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to complete
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional complex code
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        System.out.println("List contents:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // More complex code
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        Thread stringWriterThread = new Thread(() -> {
            try {
                stringQueue.put("Hello, World!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread stringReaderThread = new Thread(() -> {
            try {
                String message = stringQueue.take();
                System.out.println("Received message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        stringWriterThread.start();
        stringReaderThread.start();

        try {
            stringWriterThread.join();
            stringReaderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}