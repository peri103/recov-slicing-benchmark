import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Thread to write to the queue
        Thread writer = new Thread(() -> {
            try {
                int value = random.nextInt(100);
                /* write */ queue.put(value);
                System.out.println("Written value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read from the queue
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
                list.add(value);
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

        // Additional complex code
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("List contents:");
        for (int val : list) {
            System.out.println(val);
        }

        // Another unrelated task
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        System.out.println("String List contents:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}