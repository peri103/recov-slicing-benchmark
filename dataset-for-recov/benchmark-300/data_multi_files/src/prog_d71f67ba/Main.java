import java.util.concurrent.DelayQueue;
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
            numbers.add(i * 10);
        }

        System.out.println("Numbers list:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Simulate some processing
        Thread.sleep(500);

        // More unrelated code
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        System.out.println("Strings list:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Simulate some more processing
        Thread.sleep(500);

        DelayQueue<DelayedElement> queue = manager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue");
    }
}