import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        BlockingQueue<String> stringQueue = new ArrayBlockingQueue<>(5);
        Random random = new Random();

        try {
            // Add some random numbers to the queue
            for (int i = 0; i < 5; i++) {
                int num = random.nextInt(100);
                queue.put(num);
                System.out.println("Added number: " + num);
            }

            // Add some strings to the string queue
            stringQueue.put("Hello");
            stringQueue.put("World");
            stringQueue.put("Java");
            stringQueue.put("Programming");
            stringQueue.put("Concurrency");

            // Take and print strings from the string queue
            for (int i = 0; i < 3; i++) {
                String str = stringQueue.take();
                System.out.println("Taken string: " + str);
            }

            // Take and print numbers from the queue
            for (int i = 0; i < 3; i++) {
                int num = queue.take();
                System.out.println("Taken number: " + num);
            }

            /* write */ queue.put(42);
            System.out.println("Added special number: 42");

            // Add more random numbers to the queue
            for (int i = 0; i < 2; i++) {
                int num = random.nextInt(100);
                queue.put(num);
                System.out.println("Added number: " + num);
            }

            // Take and print the remaining numbers from the queue
            for (int i = 0; i < 3; i++) {
                int num = queue.take();
                System.out.println("Taken number: " + num);
            }

            /* read */ int value = queue.take();
            System.out.println("Taken special number: " + value);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}