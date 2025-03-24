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
                int value = random.nextInt(100);
                /* write */ queue.put(value);
                System.out.println("Value written: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("List contents: " + list);

        try {
            /* read */ int value = queue.take();
            System.out.println("Value read: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform more unrelated operations
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list elements: " + sum);
    }
}