import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            ArrayBlockingQueue<String> stringQueue = new ArrayBlockingQueue<>(10);
            List<Integer> numbers = new ArrayList<>();

            // Adding some elements to the list
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }

            // Adding elements to the string queue
            stringQueue.put("Hello");
            stringQueue.put("World");

            // Writing to the LinkedBlockingQueue
            /* write */ queue.put(42);

            // Processing the list
            for (int num : numbers) {
                System.out.println("Number: " + num);
            }

            // Taking elements from the string queue
            String firstString = stringQueue.take();
            String secondString = stringQueue.take();
            System.out.println("First String: " + firstString);
            System.out.println("Second String: " + secondString);

            // Reading from the LinkedBlockingQueue
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);

            // More unrelated operations
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Sum of numbers: " + sum);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}