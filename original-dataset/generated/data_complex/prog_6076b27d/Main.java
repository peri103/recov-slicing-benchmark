import java.util.concurrent.LinkedBlockingQueue;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Queue<String> stringQueue = new LinkedList<>();

        try {
            /* write */ queue.put(42);
            stringQueue.add("Hello");
            stringQueue.add("World");

            for (String str : stringQueue) {
                System.out.println("String from stringQueue: " + str);
            }

            int sum = 0;
            for (int i = 0; i < 5; i++) {
                queue.put(i * 10);
                sum += i * 10;
            }

            System.out.println("Sum of added integers: " + sum);

            int anotherValue = queue.take();
            System.out.println("Another value from queue: " + anotherValue);

            /* read */ int value = queue.take();
            System.out.println("Original value from queue: " + value);

            LinkedBlockingQueue<Double> doubleQueue = new LinkedBlockingQueue<>();
            for (int i = 0; i < 3; i++) {
                doubleQueue.put(i * 1.5);
            }

            while (!doubleQueue.isEmpty()) {
                System.out.println("Double value: " + doubleQueue.take());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}