import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        LinkedBlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        Random random = new Random();

        // Adding some random numbers to the string queue
        for (int i = 0; i < 5; i++) {
            stringQueue.offer("Number: " + random.nextInt(100));
        }

        // Performing some operations on the string queue
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }

        // Writing to the priority queue
        /* write */ queue.offer(1);

        // Adding more elements to the priority queue
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(100));
        }

        // Performing some operations on the priority queue
        while (!queue.isEmpty()) {
            Integer value = queue.poll();
            System.out.println("Polled value: " + value);
        }

        // Reading from the priority queue
        /* read */ Integer readValue = queue.poll();
        System.out.println("Read value: " + readValue);

        // Adding more elements to the priority queue
        for (int i = 0; i < 5; i++) {
            queue.offer(random.nextInt(50));
        }

        // Performing some operations on the priority queue
        while (!queue.isEmpty()) {
            Integer value = queue.poll();
            System.out.println("Polled value: " + value);
        }
    }
}