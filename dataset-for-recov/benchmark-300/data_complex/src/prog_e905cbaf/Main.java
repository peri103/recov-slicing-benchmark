import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        Random random = new Random();
        int randomValue = random.nextInt(100);
        deque.addLast(randomValue);
        System.out.println("Added random value: " + randomValue);

        /* write */ deque.addFirst(1);
        System.out.println("Added value 1 to the front of the deque.");

        try {
            Thread.sleep(1000); // Simulate some delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int valueFromEnd = deque.pollLast();
        System.out.println("Retrieved value from the end: " + valueFromEnd);

        try {
            /* read */ int value = deque.takeFirst();
            System.out.println("Retrieved value from the front: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            deque.addLast(i * 10);
        }

        System.out.println("Added more values to the deque.");

        while (!deque.isEmpty()) {
            System.out.println("Remaining value in deque: " + deque.poll());
        }
    }
}