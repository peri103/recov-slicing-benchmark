import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();

        // Thread to write data
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read data
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        writerThread.start();
        readerThread.start();

        // Wait for threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional code to make the program more complex
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        System.out.println("List contents:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Another SynchronousQueue for additional complexity
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        Thread stringWriterThread = new Thread(() -> {
            try {
                stringQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread stringReaderThread = new Thread(() -> {
            try {
                String message = stringQueue.take();
                System.out.println("Read message: " + message);
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