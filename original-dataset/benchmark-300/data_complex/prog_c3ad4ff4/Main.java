import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();

        // Writer thread
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Reader thread
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                list.add(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();

        // Additional code to make the program more complex
        List<Integer> anotherList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            anotherList.add(i * 10);
        }

        System.out.println("List after adding elements: " + anotherList);

        int sum = 0;
        for (int num : anotherList) {
            sum += num;
        }

        System.out.println("Sum of elements in anotherList: " + sum);

        // Print the value read from the queue
        System.out.println("Value read from the queue: " + list.get(0));
    }
}