import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Adding some complexity with an ArrayList
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("Numbers in the list: " + numbers);

        // Simulating some other operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Adding more complexity with another DelayedElement
        DelayedElement anotherElement = new DelayedElement(2000); // 2 seconds delay
        queueManager.addElement(anotherElement);

        // Simulating some waiting time
        Thread.sleep(1500);

        /* read */ DelayedElement takenElement = queueManager.getQueue().take();
        System.out.println("Element taken from queue after delay");

        // More operations after the read
        System.out.println("Processing the taken element...");
        if (takenElement == element) {
            System.out.println("First element was taken.");
        } else {
            System.out.println("Another element was taken.");
        }

        // Finalizing with some more operations
        System.out.println("Finalizing the program...");
    }
}