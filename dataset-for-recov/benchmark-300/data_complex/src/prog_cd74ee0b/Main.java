import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                int valueToWrite = random.nextInt(100);
                /* write */ queue.put(valueToWrite);
                System.out.println("Value written: " + valueToWrite);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();

        // Perform some unrelated operations
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("List before read: " + list);

        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Value read: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform more unrelated operations
        list.sort(Integer::compareTo);
        System.out.println("List after read and sort: " + list);

        // Add more complexity
        List<Integer> filteredList = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                filteredList.add(num);
            }
        }

        System.out.println("Filtered list (even numbers): " + filteredList);
    }
}