import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Create a thread to write the value
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create a thread to read the value
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        writer.start();
        reader.start();

        // Wait for both threads to finish
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Add some unrelated code to make the program more complex
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("Random list: " + list);

        // Perform some operations on the list
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list elements: " + sum);

        // Create another SynchronousQueue and perform some operations
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        Thread stringWriter = new Thread(() -> {
            try {
                stringQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread stringReader = new Thread(() -> {
            try {
                String message = stringQueue.take();
                System.out.println("Received message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        stringWriter.start();
        stringReader.start();

        try {
            stringWriter.join();
            stringReader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}