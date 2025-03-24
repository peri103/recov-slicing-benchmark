import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        manager.addElement(element);

        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("Numbers list:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Simulate some processing time
        Thread.sleep(500);

        // Add more elements to the queue
        manager.addElement(new DelayedElement(500));
        manager.addElement(new DelayedElement(1500));

        // Simulate some more processing time
        Thread.sleep(200);

        /* read */ DelayedElement takenElement = manager.getQueue().take();
        System.out.println("Taken element: " + takenElement);

        // Additional processing after the read
        System.out.println("Remaining elements in the queue:");
        while (!manager.getQueue().isEmpty()) {
            DelayedElement remainingElement = manager.getQueue().take();
            System.out.println(remainingElement);
        }
    }
}