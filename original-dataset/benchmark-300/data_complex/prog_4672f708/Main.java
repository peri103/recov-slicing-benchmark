import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

        try {
            // Adding elements to the blocking queue
            blockingQueue.put(10);
            blockingQueue.put(20);
            blockingQueue.put(30);

            /* write */ queue.put(42);

            // Taking elements from the blocking queue
            int value1 = blockingQueue.take();
            int value2 = blockingQueue.take();
            int value3 = blockingQueue.take();

            System.out.println("Values from blocking queue: " + value1 + ", " + value2 + ", " + value3);

            /* read */ int value = queue.take();
            System.out.println("Value from LinkedTransferQueue: " + value);

            // Adding more elements to the blocking queue
            blockingQueue.put(40);
            blockingQueue.put(50);

            // Taking more elements from the blocking queue
            int value4 = blockingQueue.take();
            int value5 = blockingQueue.take();

            System.out.println("More values from blocking queue: " + value4 + ", " + value5);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}