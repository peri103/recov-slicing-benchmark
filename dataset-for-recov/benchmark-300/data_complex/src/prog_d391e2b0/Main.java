import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        List<Integer> numbers = new ArrayList<>();

        // Adding some unrelated code
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Writing to the original queue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        writerThread.start();

        // Using another SynchronousQueue for a different purpose
        Thread stringWriterThread = new Thread(() -> {
            try {
                stringQueue.put("Hello, World!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        stringWriterThread.start();

        // Reading from the original queue
        try {
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Reading from the string queue
        try {
            String message = stringQueue.take();
            System.out.println("Message from stringQueue: " + message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More unrelated code
        System.out.println("Numbers list:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}