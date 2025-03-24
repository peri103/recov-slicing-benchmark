import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        manager.addElement(element);

        // Additional complex code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        List<Integer> squaredNumbers = new ArrayList<>();
        for (int num : numbers) {
            squaredNumbers.add(num * num);
        }

        System.out.println("Squared numbers: " + squaredNumbers);

        // Simulating some other operations
        DelayQueue<DelayedElement> anotherQueue = new DelayQueue<>();
        anotherQueue.put(new DelayedElement(500)); // 0.5 second delay
        anotherQueue.take();
        System.out.println("Element taken from another queue");

        // More complex operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        for (String str : strings) {
            System.out.println(str);
        }

        /* read */ DelayedElement takenElement = manager.getQueue().take();
        System.out.println("Element taken from queue after delay");
    }
}